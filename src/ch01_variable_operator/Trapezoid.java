package ch01_variable_operator;

public class Trapezoid {
    public static void main(String[] args) {
        double 밑변 = 20.0;
        double 윗변 = 10.0;
        double 높이 ;
        double 면적 ;

        높이 = 15.0;
        면적 = (밑변+윗변) * 높이/2;


        System.out.println("밑변 : "+밑변);
        System.out.println("윗변 : "+윗변);
        System.out.println("높이 : "+높이);
        System.out.println("면적 : "+면적);
    }
}
