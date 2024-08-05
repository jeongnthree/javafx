package ch05_package_inheritance.mypackage.animalpkg01;

public class Lion01 extends Animal01 {
    private int leg ;

    public void run(){
        String message = super.getName() + "이(가) " + super.getSpeed() + "의 속도로 달려 갑니다.";
        System.out.println(message);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        String message = super.getName() + "의 다리 개수는 " + leg + "개입니다.";
        System.out.println(message);
    }

    public Lion01(String name, int lifespan, String habitat, int speed, int leg) {
        super(name, lifespan, habitat, speed);
        this.leg = leg ;
    }
}
