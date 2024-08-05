package ch02_control_statement;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 0;
        int counter = 0;

        while (true){
            System.out.print("점수 입력 :");
            int grade = scan.nextInt();

            if(grade<=0){
                System.out.println("음수 또는 0이 입력되어 종료");
                break;
            }

            total +=grade;
            counter +=1;
        }

        System.out.println("총 빈도수 : " + counter);
        System.out.println("총점 : " + total);

        double average = (double)total/counter;
        System.out.printf("평균 : %.3f\n", average);



       // scan.close();
    }
}
