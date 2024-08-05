package ch02_control_statement;

import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수 1개 입력 :");
        int su = scan.nextInt();


        for (int i=1;i<=su; i++){
            String message = i+ "의 제곱은" + (i*i) +"입니다.";
            System.out.println(message);

        }

        scan.close();
    }
}
