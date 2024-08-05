package ch05_package_inheritance.mypackage.polymorphism;

public class InheTest01 {
    public static void main(String[] args) {
        Americano01 americano = new Americano01();

        // private 변수나 메소드는 상속을 하지 못합니다.
        americano.setName("아메리카노");
        System.out.println("품명 : " + americano.getName());

        // 상속을 받고 있으므로 슈퍼 클래스 내의 변수에 접근이 가능합니다.
        americano.price = 5000;
        System.out.println("가격 : " + americano.price);

        // private 상태가 아니고, 서브 클래스가 보유하고 있는 멤버 변수이므로 직접 읽기/쓰기가 가능합니다.
        americano.volume = 500;
        americano.isHot = true ;
        System.out.println("용량 : " + americano.volume + "ml");
        System.out.println("따듯함 여부 : " + americano.isHot);
    }
}
