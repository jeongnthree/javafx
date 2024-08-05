package ch05_package_inheritance.mybeverage;

public class Americano04 extends Beverage04 {
    private double waterAmount;

    @Override
    public String toString() {
        String message = "투입할 물의 양은 " + waterAmount + "입니다.";
        return super.toString() + message;
    }

    public void sipAmericano(){
        // sip : 음료를 홀짝이다, 조금씩 마시다.
        String message = super.getName() + "를(을) 홀짝 홀짝 마십니다.";
        System.out.println(message);
    }

    // 어노테이션은 @로 시작하는 고급 형태의 주석입니다.
    @Override // 이 메소드는 오버라이딩 되었습니다.
    protected void showInfo() {
        super.showInfo();
        System.out.println("투입된 물의 량 : " + waterAmount + "ml");
    }

    public Americano04(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount ;
    }
}
