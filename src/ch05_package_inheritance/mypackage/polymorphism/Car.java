package ch05_package_inheritance.mypackage.polymorphism;

public class Car {
    private String name ; // 이름
    private int price ; // 가격

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Car() {
    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
