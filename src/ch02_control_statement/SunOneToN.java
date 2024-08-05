package ch02_control_statement;

import java.util.Scanner;

public class SunOneToN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 0;
        System.out.print("정수 1개 입력 :");
        int su = scan.nextInt();

        for (int i=1;i<=su ; i++){
            total +=i;
        }

        System.out.println("총합" + total);

        scan.close();
    }
}
