package ch06_abstract_interface.myshape.beberagetest;

public class Latte05 extends Beverage05{
    private String milkType;

    public Latte05(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }

    @Override
    void dink() {
        String message = "마시는법\n";
        message += "부드럽고 크리미한" + super.getName() + "를 마십니다.";
        System.out.println(message + "\n");
    }

    @Override
    void make() {
        String message = "만드는법\n";
        message += super.getName() + "를 만들땐" + "메인 재료" + this.milkType + "가 필수 입니다.";
        System.out.println(message);
        System.out.println("=================================");

    }
}
