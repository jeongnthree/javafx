package ch02_control_statement;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수 1개 입력 :");
        int su = scan.nextInt();

        if(su%2==0){
            System.out.println(su + "호호호");
        }else{
            System.out.println(su + "하하하");
        }

        if(su%2==0){
            System.out.println(su + "는(은) 짝수입니다");
        }else{
            System.out.println(su + "는(은 홀수입니다.");
        }

        scan.close();
    }
}
