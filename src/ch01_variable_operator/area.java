package ch01_variable_operator;

import java.sql.SQLOutput;

public class area {
    public static void main(String[] args) {
        double 너비;
        double 높이;
        double 넓이;
        double 둘레;
        double 대각선;

        너비 = 10.0;
        높이 = 5.0;
        넓이 = 너비*높이;
        둘레 = (너비*2) + (높이*2);
        대각선 = Math.sqrt(너비*너비 + 높이*높이);

        System.out.println("너비:" + 너비);
        System.out.println("높이:" +높이);
        System.out.println("넓이는\t" + 넓이);
        System.out.println("둘레:" +둘레);
        System.out.println("대각선:" +대각선);
    }
}
