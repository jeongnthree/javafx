package ch04_class;

import java.util.Random;
import java.util.Scanner;

public class SaramMain01 {
    public static void main(String[] args) {
        int x ;
        x = 5 ;

        int y = 7 ;

        // 단계02 : 객체 생성
        // 클래스이름  객체이름 = new 생성자();
        // 생성자의 이름은 반드시 클래스의 이름과 동일해야 합니다.
        Saram01 yusin = new Saram01();

        Saram01 soon;
        soon = new Saram01();

        // 단계03 : 변수에 값 할당(write)
        // . 기호를 멤버 참조 연산자라고 부릅니다.
        yusin.nationality = "대한 민국";
        yusin.name = "김유신";
        yusin.height = 172.5 ;
        yusin.weight = 75.0 ;
        yusin.hobby = "당구";
        yusin.blood = "AB" ;


        // 단계04 : 멤버 변수들의 값 출력(read)
        System.out.println("국적 : " + yusin.nationality);
        System.out.println("이름 : " + yusin.name);
        System.out.println("키 : " + yusin.height);
        System.out.println("몸무게 : " + yusin.weight);
        System.out.println("취미 : " + yusin.hobby);
        System.out.println("혈액형 : " + yusin.blood);

        // 메소드 호출
       // Scanner scan = new Scanner(System.in);
        //System.out.println("주민번호 뒷자리 입력 : ");
       // int su = scan.nextInt();


        String message = yusin.showGenderInfo(3);
       // String message = yusin.showGenderInfo(su);
        System.out.println(message);

        System.out.println(yusin.showBmiInfo());

        yusin.display();

        soon.nationality = "대한 민국";
        soon.name = "유관순";
        soon.height = 168.5 ;
        soon.weight = 52.0 ;
        soon.hobby = "축구";
        soon.blood = "O" ;

        // 단계04 : 멤버 변수들의 값 출력(read)
        System.out.println("국적 : " + soon.nationality);
        System.out.println("이름 : " + soon.name);
        System.out.println("키 : " + soon.height);
        System.out.println("몸무게 : " + soon.weight);
        System.out.println("취미 : " + soon.hobby);
        System.out.println("혈액형 : " + soon.blood);

        message = soon.showGenderInfo(4);
        System.out.println(message);

        System.out.println(soon.showBmiInfo());
        soon.display();

        // 타입[] 배열이름 = new 타입[요소개수] ;
        int[] a = new int[3];

        // Saram01 클래스로 3명의 정보를 저장할 배열을 만듭니다.
        Saram01[] saram = new Saram01[3]; // 배열 정의

        System.out.println("배열 요소들 값 출력");

        for (int i = 0; i < saram.length; i++) {
            saram[i] = new Saram01(); // 객체 생성

            saram[i].nationality = "korea";
            saram[i].name = "철수" + (i+1);
            saram[i].height = 160.0 + 10.0 * (i+1);
            saram[i].weight = 60.0 + 10.0 * (i+1);
            saram[i].hobby = "탁구";
            saram[i].blood = "AB";

            System.out.println("\n" + i + "번째 사람 정보");
            saram[i].display();
        }


    }
}
