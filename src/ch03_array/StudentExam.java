package ch03_array;

import java.util.Scanner;

public class StudentExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("학생 이름 입력 :");
        String name = scan.next();

        double total = 0.0;

        String[] subject = {"국어", "영어", "수학"};
        int[] jumsu = new int[subject.length];


        for (int i = 0; i < jumsu.length ; i++) {
            System.out.print(subject[i] + "점수 입력 :");
            jumsu[i] = scan.nextInt();
            total += jumsu[i];


        }

        double average = total/ jumsu.length;

        System.out.println("학생의 정보");
        String temp = "이름: %s, 총점 : %f.2f, 평균 : %.2f";
        System.out.printf(temp,name,total,average);





        scan.close();
    }
}
