package ch05_package_inheritance.mypackage.polymorphism;

public class Sonata extends Car {
    private String maker ; // 제조 회사(메이커)

    public String getMaker() {
        return maker;
    }

    public Sonata() {
    }

    public Sonata(String name, int price, String maker) {
        super(name, price);
        this.maker = maker;
    }
}
