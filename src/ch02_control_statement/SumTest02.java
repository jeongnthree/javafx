package ch02_control_statement;

import java.util.Scanner;

public class SumTest02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1번째 정수 입력 :");
        int first = scan.nextInt();
        System.out.print("2번째 정수 입력 :");
        int second = scan.nextInt();

        if(first<0){
            first = -first;
        }

        if(second<0){
            second = -second;
        }

        if(first>second) {

            int temp;
            temp = first;
            first = second;
            second = temp;

        }



        int total = 0;

        for (int i = first; i <= second ; i++) {
            if(i%3!=0){
                total +=i;
            }


        }
        System.out.println(total);


        scan.close();
    }
}
