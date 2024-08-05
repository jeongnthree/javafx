package ch02_control_statement;

import java.util.Scanner;

public class If04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("시험 점수 입력 :");
        int score = scan.nextInt();
        System.out.println("점수 : " + score);

        if (score > 90) {
            System.out.println("A 학점");

        } else if (score >= 80) {
            System.out.println("B 학점");
        } else if (score >= 70) {
            System.out.println("C 학점");
        } else if (score >= 60) {
            System.out.println("D 학점");
        }


        System.out.println("이름 입력:");
        String name = scan.next();

        System.out.println("국어 점수 입력 :");
        int kor = scan.nextInt();
        System.out.println("영어 점수 입력 :");
        int eng = scan.nextInt();
        System.out.println("수학 점수 입력 :");
        int math = scan.nextInt();

        int total = kor + eng + math;
        double averane = total / 3;

        System.out.println("국어 응시자 이름" + kor);
        System.out.println("영어 응시자 이름" + eng);
        System.out.println("수학 응시자 이름" + math);
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + averane);

        System.out.println("su1 :");
        int su1 = scan.nextInt();
        System.out.println("su2 :");
        int su2 = scan.nextInt();

        if (su1 > su2) {
            System.out.println("1번째 정수가 크거나 같습니다");
            System.out.println("큰 수 :" + 100);
        }
    }
}