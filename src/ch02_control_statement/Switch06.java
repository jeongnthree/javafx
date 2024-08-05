package ch02_control_statement;

import java.util.Scanner;

public class Switch06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("시험 점수 입력 :");
        int score = scan.nextInt();

        switch (score/10){
            case 10:
            case 9:
                System.out.println("A 학점");
                break;
            case 8:
                System.out.println("B 학점");
                break;
            case 7:
                System.out.println("C 학점");
                break;
            case 6:
                System.out.println("D 학점");
                break;
            default:
                System.out.println("F 학점");
                break;

        }

        scan.close();
    }
}
