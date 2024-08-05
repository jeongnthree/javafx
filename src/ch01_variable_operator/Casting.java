package ch01_variable_operator;

import java.sql.SQLOutput;

public class Casting {
    public static void main(String[] args) {
        double d;
        d = 100;
        System.out.println("d : " + d);//암시적 형변환

        int i = (int) 12.5; //명시적 형변환
        System.out.println("i :" + i);

        System.out.println(14 / 5);

        System.out.println((double) 14 / 5);

        System.out.println((double) (14 / 5));

        int kor = 50, eng = 60, math = 80;
        int total = kor + eng + math;
        double average = (double) total / 3;

        char ch1 = 'c';
        char ch2 = 'a';
        boolean bool1 = ch1 > ch2;
        System.out.println("bool1 : " + bool1);

        char ch3 = 'D';
        String str = 'A' <= ch3 && ch3 <= 'Z' ? "yes" : "No";
        System.out.println("대문자 판단 : "+ str);

        char ch4 = 'e';// 대문자 E로 바꿀려면
        char newch4 = (char) (ch4-32) ;

        System.out.println("'A' :" + newch4);


    }
}
