package ch05_package_inheritance.mypackage.polymorphism;

public class Americano02 extends Beverage02 {
    private double volume ; // 용량(예시 300ml, 400ml 등등)
    private boolean isHot ; // 따듯한 음료인가(따듯하면 true)

    public Americano02(){
        // 서브 클래스의 생성자의 1번째 줄에는 암시적으로 super();라는 코드가 숨어 있습니다.
        super(); // super()는 매개 변수가 0개인 부모의 생성자를 호출
        System.out.println("B");
    }

    public Americano02(String name, double price, double volume, boolean isHot) {
        // 매개 변수들을 슈퍼 클래스에서 처리해 달라고 넘겨 줌
        super(name, price);
        System.out.println("C");
        this.volume = volume ;
        this.isHot = isHot ;
    }

    public void display() {
        super.showInfo();
        System.out.println("용량 : " + this.volume + "ml");
        System.out.println("따듯함 여부 : " + this.isHot);
    }
}
