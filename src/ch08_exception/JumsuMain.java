package ch08_exception;

import java.util.Scanner ;
/*
    try..catch 구문에서 catch는 여러 번 사용이 가능합니다. (O)
    try..catch 구문에서 catch는 사용하지 않아도 됩니다. (X)
    try..catch 구문은 중첩이 가능합니다. (O)
*/
public class JumsuMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in ) ;
        try {
            System.out.print("응시자 입력 : ");
            String name = scan.next() ;

            System.out.print("국어 입력 : ");
            int kor = scan.nextInt() ;

            System.out.print("영어 입력 : ");
            int eng = scan.nextInt() ;

            System.out.print("수학 입력 : ");
            int math = scan.nextInt() ;

            int total = kor + eng + math ;
            if((kor < 0 || kor > 100) || (eng < 0 || eng > 100) || (math < 0 || math > 100)){
                throw new Between1And100("시험 점수의 범위는 1이상 100이하입니다.") ;
            }

            if(kor < 40){
                throw new MinJumsuException("국어", "과락") ;
            }
            if(eng < 40){
                throw new MinJumsuException("영어", "과락") ;
            }
            if(math < 40){
                throw new MinJumsuException("수학", "과락") ;
            }

            if(total < 180){
                throw new FailedException("평균 이하 점수") ;
            }

            double average = (double)total / 3.0 ;
            System.out.println("총점 : " + total);
            System.out.printf("평균 : %.2f\n", average);
            System.out.println("프로그램 정상 종료됨" );

        } catch (MinJumsuException e) {
            System.out.println( e.toString() );
            System.out.println( e.getMessage() );
            e.printStackTrace();

        } catch (FailedException e) {
            System.out.println( e.toString() );
            System.out.println( e.getMessage() );
            e.printStackTrace();

        } catch (Between1And100 e) {
            System.out.println( e.toString() );
            System.out.println( e.getMessage() );
            e.printStackTrace();

        } catch(Exception e){
            System.out.println("나머지 예외 발생");

        }finally{
            if(scan != null){scan.close() ;}
        }
    }
}