package ch04_class;

public class SaramMain02 {
    public static void main(String[] args) {
        // 클래스 변수는 클래스 이름을 이용하여 접근이 가능합니다.
        Saram02.nationality = "대한 민국";

        //클래스이름 객체이름 = new 생성자이름();
        Saram02 yusin = new Saram02();

        Saram02 soon ;
        soon = new Saram02() ;

        //yusin.nationality = "한국";
        yusin.name = "김유신";
        yusin.height = 172.5;
        yusin.weight = 80.2;
        yusin.hobby = "당구";
        yusin.blood = "AB";

        soon.nationality = "한국";
        soon.name = "유관순";
        soon.height = 168.5;
        soon.weight = 53.2;
        soon.hobby = "축구";
        soon.blood = "O";

        soon.display();
        System.out.println();
        yusin.display();
    }
}
