package ch02_control_statement;

import java.util.Scanner;

public class I01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1~12 사이의 정수 입력 :");
        int month = scan.nextInt();
        String season = "";
        if (month >= 3 && month <= 5) {
            season = "봄";
        } else if (month >= 6 && month <= 8) {
            season = "여름";
        } else if (month >= 9 && month <= 11) {
            season = "가을";
        } else {
            season = "겨울";
        }

        String message = "%d월은 %s입니다.";
        System.out.printf(message, month, season);

        System.out.println("1~12 사이의 정수 중 1개 입력 :" );



        scan.close();

    }
}