package ch02_control_statement;

import java.util.Scanner;

public class GuguDan02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("시작 단수 입력 :");
        int begin = scan.nextInt();
        System.out.print("끝 단수 입력 :");
        int end = scan.nextInt();

        if(begin>end){
            int temp = begin;
            begin=end;
            end=temp;

        }
        for (int i = begin; i<= end  ; i ++) {
            for (int j = 1; j < 10; j++) {
                String gugudan = "%d * %d = %2d\t";
                System.out.printf(gugudan,i,j,(i*j));

            }
            System.out.println();



        }

        scan.close();
    }
}
