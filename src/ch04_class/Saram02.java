package ch04_class;

public class Saram02 {
    // static 변수는 여러 객체들이 공유할 목적으로 만드는 변수입니다.
    // 클래스 이름으로 접근이 가능하므로 '클래스 변수'라고 부르기도 합니다
    // static 변수 = 클래스 변수 = 정적 변수
    static String nationality;

    String name ;
    double height ;
    double weight ;
    String hobby = "축구";
    String blood;

    final double PI = 3.14 ; // 원주율

    //반환타입 메소드이름(매개변수목록){...}
    void display(){
        //PI = 5.14 ;


        int total = 0 ;
        for (int i = 1; i < 11; i++) {
            total += i;
        }

        System.out.println("총합 : " + total);

        System.out.println("국적 : " + nationality);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("취미 : " + hobby);
        System.out.println("혈액형 : " + blood);
    }
}
