package ch02_control_statement;

import java.util.Random;
import java.util.Scanner;

public class Ans26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();

        int counter =0;
        int answer =random.nextInt( 100) +1;


        System.out.println("정답: " + answer);



        while (true){
            System.out.print("1~100 사이의 정수 1개 입력:");
            int su = scan.nextInt();
            counter +=1;

            if(su<answer){
                System.out.println("up" );
            }else if(su>answer){
                System.out.println("down" );

            }else{
                System.out.println("정답");
                break;
            }



        }
        System.out.println(counter + "빙고");
        scan.close();









    }
}
