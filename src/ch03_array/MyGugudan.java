package ch03_array;

import java.util.Scanner;

public class MyGugudan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("시작 단수 입력 :");
        int begin = scan.nextInt();

        System.out.println("끝 단수 입력 :");
        int end = scan.nextInt();

        if(begin<0){
            begin = Math.abs(begin);
        }

        if(end<0){
            end = Math.abs(end);
        }
        // end = end<0 ? -end : +end
        if(begin>end){
            int temp = begin;
            begin = end;
            end = temp;
        }
        int row = end - begin + 1;
        int col = 9;//열수(구구단이므로...)
        int[][] arr = new int[row][col];

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]= (begin+i)*(j+1);

                String imsi = "%d*%d=%d\t";
                System.out.printf(imsi, begin+i,j+1, arr[i][j]);

            }
            System.out.println();

        }

    }
}
