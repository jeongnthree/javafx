package ch05_package_inheritance.mybeverage;

public class Espresso04 extends Beverage04 {
    private int shotCount;

    @Override
    public String toString() {
        String message = "투입할 샷의 개수는 " + shotCount + "개입니다.";
        return super.toString() + message;
    }

    public void drinkEspresso() {
        String message = "맛이 진하고 강렬한 %s를 마십니다.\n";
        System.out.printf(message, super.getName());
    }

    @Override
    protected void showInfo() {
        super.showInfo();
        System.out.println("샷 추가 개수 : " + shotCount);
    }

    public Espresso04(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount ;
    }
}
