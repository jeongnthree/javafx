package ch06_abstract_interface.myshape.beberagetest;

public class Americano05 extends Beverage05{

    private double waterAmount;

    public Americano05(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }



    @Override
    void dink() {
        String message = "마시는법\n";
        message += super.getName() + "를 홀짝 홀짝 마십니다.";
        System.out.println(message+ "\n");
    }

    @Override
    void make() {
        String message = "만드는법\n";
        message += super.getName() + "를 만들땐" + "물의양을" + this.waterAmount + "ml가 필수 입니다.";
        System.out.println(message);
        System.out.println("=================================");

    }
}
