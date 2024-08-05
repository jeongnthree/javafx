package ch05_package_inheritance.mypackage.polymorphism;

public class Beverage02 {
    private String name ; // 음료 이름
    private double price ; // 단가

    public Beverage02() {
        System.out.println("A");
    }

    public Beverage02(String name, double price) {
        System.out.println("D");
        this.name = name ;
        this.price = price ;
    }

    protected void showInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("단가 : " + this.price);
    }
}
