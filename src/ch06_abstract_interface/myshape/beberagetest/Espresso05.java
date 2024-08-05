package ch06_abstract_interface.myshape.beberagetest;

public class Espresso05 extends Beverage05{
    private int shotCount;

    public Espresso05(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }

    @Override
    void dink() {
        String message = "마시는법\n";
        message += "맛이 진하고 강렬한" + super.getName() + "마십니다.";
        System.out.println(message+ "\n");
    }

    @Override
    void make() {
        String message = "만드는법\n";
        message += super.getName() + "를 만들땐" + "샷추가" + this.shotCount + "번이 필수 입니다.";
        System.out.println(message);
        System.out.println("=================================");

    }
}
