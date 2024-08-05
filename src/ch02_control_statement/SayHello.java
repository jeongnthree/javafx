package ch02_control_statement;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("반복할 횟수 :");
        int su = scan.nextInt();

        for (int i = 1; i <= su; i++) {
            System.out.println("hello");
        }

        System.out.println("2~9 정수 중에서 하나를 선택한다.");
        su = scan.nextInt();

        int total=0;
        for (int i = 2; i <=su; i++) {
            total=su*i;
        }
    }
}
