package ch02_control_statement;

import java.util.Scanner;

public class Exam4_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("별 출력 개수 입력 :");
        int star = scan.nextInt();
        System.out.println("별 출력 개수 입력 :"+star);

        for(int i=1; i<=star; i++){
            System.out.print("*");
            if (i%5==0){
                System.out.println();
            }
        }

        System.out.println("\n한줄에 몇게 출력할까요?");
        int oneline = scan.nextInt();


        for(int i=1; i<=star; i++){
            System.out.print("*");
            if(i%oneline==0){
                System.out.println();
            }
        }



        scan.close();
    }
}
