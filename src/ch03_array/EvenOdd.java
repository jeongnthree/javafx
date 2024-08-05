package ch03_array;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열의 규모 정하기 :");
        int size = scan.nextInt();

        int[] jumsu = new int[size];

        int oventotal =0;
        int oddtotal =0;

        for (int i = 0; i < size; i++) {
            System.out.println((i+1) + "번째 요소 입력");
            jumsu[i]= scan.nextInt();

            if(jumsu[i]%2 ==0){
                oventotal += jumsu[i];

            }else {
                oddtotal += jumsu[i];
            }
        }
        System.out.println("짝수의 종합 ; " + oventotal);
        System.out.println("홀수의 종합 ; " + oddtotal);

        scan.close();
    }
}
