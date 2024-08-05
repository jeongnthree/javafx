package ch03_array;

import java.util.Scanner;

public class Ans24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열 크기 정하기 :");
        int size = scan.nextInt();

        double[] score = new double[size];
        double total = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.println(i + "번째 데이터 입력");
            score[i] = scan.nextDouble();

            String temp = "score[%d] = %f\n";
            System.out.printf(temp, i, score[i]);

            total += score[i];

        }

        double average = total / score.length;

        System.out.printf("총합 : %.2f\n", total);
        System.out.printf("평균 : %.2f\n", average);

        scan.close();
    }
}
