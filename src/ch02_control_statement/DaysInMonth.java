package ch02_control_statement;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("월(숫자 1~12중 1개) 입력 :");
        int month = scan.nextInt();
        int last_day = 0;

        switch (month){
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                last_day = 31;
                break;


            case 4: case 6: case 9: case 11:
                last_day = 30;
                break;



            case 2:
                last_day = 28;
                break;


            default:
                System.out.println("월 입력이 잘못 되었습니다.");
                System.exit(0);

            String message = "%d월의 마지막 날짜는 %d입니다.";
                System.out.printf(message,month,last_day);
        }

        scan.close();
    }
}
