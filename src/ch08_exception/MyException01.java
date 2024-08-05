package ch08_exception;

public class MyException01 {
    public static void main(String[] args) {
        int x = 3, y = 0 ;
        int[] arr = {10, 20, 30 } ;

        try{
            System.out.println("아직 예외가 발생하지 않았습니다.");
            arr[3] = 50 ; //배열 요소 인덱스 문제
            System.out.println( x / y ); //0으로 나누기 문제
            System.out.println("예외가 발생하면 나는 실행이 되지 않습니다.");

        }catch (ArithmeticException ex){
            System.out.println("0으로 나누시면 안됩니다.");

        }catch (ArrayIndexOutOfBoundsException ex){
            // ArrayIndexOutOfBoundsException ex = new ArrayIndexOutOfBoundsException();

            // 이때 ex를 예외 객체라고 부릅니다.
            System.out.println("배열 인덱스 오류가 발생했습니다.");

            System.out.println("관련 문자열 : " + ex.toString());

            System.out.println("메시지 : " + ex.getMessage());

            ex.printStackTrace(); // 오류 추적기 메소드

        }catch (Exception ex){
            System.out.println("기타 나머지 예외 발생.");

        }finally {
            System.out.println("나는 예외 발생 여부와 상관없이 무조건 실행됩니다.");
            System.out.println("파일 닫기, 데이터 베이스 접속 종료 등에 사용됩니다.");
        }
    }
}
