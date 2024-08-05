package ch05_package_inheritance.mypackage.animalpkg01;

public class GoldFish01 extends Animal01 {
    private int gill ;

    public GoldFish01(String name, int lifespan, String habitat, int speed, int gill) {
        super(name, lifespan, habitat, speed);
        this.gill = gill ;
    }

    public void swim(){
        String message = super.getName() + "이(가) " + super.getSpeed() + "의 속도로 헤엄칩니다.";
        System.out.println(message);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        String message = super.getName() + "의 아가미수는 " + gill + "개입니다.";
        System.out.println(message);
    }
}
