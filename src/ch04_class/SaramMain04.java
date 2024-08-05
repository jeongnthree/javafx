package ch04_class;

public class SaramMain04 {
    public static void main(String[] args) {
        //클래스이름 객체 = new 생성자이름();
        Saram04 soo = new Saram04();
        soo.display();

        Saram04 hee = new Saram04("박영희", 162.5, 50.0, "운동", "B");
        hee.display();


        Saram04 yusin = new Saram04("김유신", 175.5, 72.0, "B");
        yusin.display();
    }
}
