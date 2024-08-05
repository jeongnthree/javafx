package ch06_abstract_interface.myshape.beberagetest;

abstract public class Beverage05 {
    private String name;
    private double price;

    public Beverage05() {
    }

    public String getName() {
        return name;
    }

    public Beverage05(String name, double price) {
        this.name = name;
        this.price = price;
    }
    final void showData(){
        System.out.println("이름 가격 정보");
        System.out.println("음료 이름 : " + this.name);
        System.out.println("음료 가격 : " + this.price);
        System.out.println();
    };
    abstract void dink();
    abstract void make();
}
