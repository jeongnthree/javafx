package ch04_class;

import java.util.Scanner;

public class Saram04 {
    private String name ;
    private double height ;
    private double weight ;
    private String hobby = "볼링";
    private String blood ;

    // 눈에 보이지 않지만 디폴트 생성자가 존재합니다.

    Scanner scan = null ;

    //반환타입 메소드이름(매개변수목록){...}
    public Saram04(){
        System.out.println("난 디폴트 생성자야~~아 배고파");
        this.name = "김철수"; // 변수 초기화
//        this.hobby = "볼링" ;
        this.scan = new Scanner(System.in) ; // 장비 초기화
    }

    public Saram04(String name, double height, double weight, String hobby, String blood){
        this.name = name ;
        this.height = height ;
        this.weight = weight ;
        this.hobby = hobby ;
        this.blood = blood ;
    }

    // 취미가 없는 경우 기본 값으로 "볼링"으로 설정하려면???
    public Saram04(String name, double height, double weight, String blood) {
        this.name = name ;
        this.height = height ;
        this.weight = weight ;
        this.blood = blood ;
//        this.hobby = "볼링" ;
    }


    public void display(){
        System.out.println("이름 : " + this.name);
        System.out.println("키 : " + this.height);
        System.out.println("몸무게 : " + this.weight);
        System.out.println("취미 : " + this.hobby);
        System.out.println("혈액형 : " + this.blood);
    }
}
