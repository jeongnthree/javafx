package ch07_utility_classes;

import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        Random rnd = new Random();

        for (int i = 0; i < 2; i++) {
            System.out.println((i+1) + "번째 랜덤 값 추출");
            System.out.println("boolean 타입의 난수 : " + rnd.nextBoolean());

            System.out.println("int 타입의 난수 : " + rnd.nextInt());
            System.out.println("long 타입의 난수 : " + rnd.nextLong());

            System.out.println("float 타입의 난수 : " + rnd.nextFloat());
            System.out.println("double 타입의 난수 : " + rnd.nextDouble());
			
			// nextGaussian() : 정규(가우스) 분포를 따르는 난수 만들기
            System.out.println("Gaussian 타입의 난수 : " + rnd.nextGaussian());
            System.out.println();
        }
        int start = -5 ;
        int end = 8 ;
        int gaesu = 10 ;
        System.out.println(start + "이상 " + end + " 이하의 임의의 정수 " + gaesu + "개 추출하기");
        // 0 <= rnd.nextInt(su) < su

        // 데이터를 저장할 배열
        int[] array = new int[gaesu] ;

        int mybound = end - start + 1 ;

        for (int i = 0; i < array.length; i++) {
			// System.out.println("난수 출력하기");
            int rand = rnd.nextInt(mybound) + start ;
            System.out.println(i + "번째 난수 : " + rand) ;
            array[i] = rand ;
        }

        System.out.println("배열 요소 값 출력");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }

        // 5부터 8사이의 임의의 정수 5개 출력
        start = 5 ;
        end = 8 ;
        mybound = end - start + 1 ;
        gaesu = 5 ;

        System.out.println(start + "부터 " + end + " 사이의 임의의 정수 " + gaesu + "개 추출하기");

        for (int i = 1; i <= gaesu ; i++) {
            int rand = rnd.nextInt(mybound) + start ;
            System.out.println(i + "번째 난수 : " + rand) ;
        }
		
		gaesu = 11 ;
        int truepart = 0, falsepart = 0 ;

        for (int i = 0; i < gaesu; i++) {
            boolean result = rnd.nextBoolean();
            if (result==true){
                truepart++ ;
            }else{
                falsepart++ ;
            }
        }
        String menu = truepart >= falsepart ?  "짜장면" : "짬뽕" ;

        System.out.println("참 : " +  truepart + "번");
        System.out.println("거짓 : " +  falsepart + "번");
        String message = "오늘 점심 메뉴 : %s\n" ;
        System.out.printf(message, menu);
    }
}