package ch08_exception;

import java.util.Scanner;

public class ExcepTest02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        try{
            System.out.print("첫 번째 정수 입력 : ");
            int x = Integer.parseInt(scan.next()) ;
            System.out.print("두 번째 정수 입력 : ");
            int y = Integer.parseInt(scan.next()) ;
            System.out.println(x / y);
        }catch (NumberFormatException err){
            System.out.println("올바른 숫자 형식을 입력하셔야 합니다.");
        }catch (ArithmeticException err){
            System.out.println("0으로 나누기 예외 발생");
        }catch (Exception err){
            System.out.println("나머지 예외 항목 발생");
        }finally {
            System.out.println("스캐너 장치를 닫습니다.");
            scan.close() ;
        }

    }
}