package ch05_package_inheritance.mypackage.polymorphism;

public class Avante extends Car {
    private String comment ; // 코멘트

    public String getComment() {
        return comment;
    }

    public Avante() {
    }

    public Avante(String name, int price, String comment) {
        super(name, price);
        this.comment = comment;
    }
}
