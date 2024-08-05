package ch02_control_statement;

import java.util.zip.ZipFile;

public class SumTest {
    public static void main(String[] args) {
        int sumA = 0, sumB = 0, sumC = 0;


        for (int i = 0; i <11 ; i++) {
            if(i%3==0){
                sumA +=i;
            }else {
               if(i>=5){
                   if(i!=8){
                       sumB +=i;
                   }
               }else {
                   sumC +=i;
                }
            }

        }

        System.out.println("sumA :" + sumA );
        System.out.println("sumB :" + sumB );
        System.out.println("sumC :" + sumC );

    }
}
