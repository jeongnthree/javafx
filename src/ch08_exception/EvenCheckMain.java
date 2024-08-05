package ch08_exception;

import java.util.Random;
import java.util.Scanner;

public class EvenCheckMain {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.print("테스트 회수 : ");
        int cnt = scan.nextInt();

        for (int i = 1; i <= cnt ; i++) {
            System.out.println("\n" + i + "번째 시도 결과");
            int su = rand.nextInt(15) + 1 ;
            if(su%2==0){
                System.out.println("정상 프로그램 : " + su);
            }else{
                try{
                    // 홀수이므로 예외 처리 필요
                    String message = "홀수라서 예외 처리합니다." ;
                    throw new OddNumberException(i , su, message);

                }catch (OddNumberException err){
                    System.out.println(err.getMessage());
                    System.out.println(err.toString());
                    err.printStackTrace();
                }
            }
        }
    }
}
