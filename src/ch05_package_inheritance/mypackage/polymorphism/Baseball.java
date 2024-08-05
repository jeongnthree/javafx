package ch05_package_inheritance.mypackage.polymorphism;

public class Baseball extends Sport {
    private int innings; // 이닝 수
    private double hitrate; // 타율

    public Baseball(String name, int entry, int innings, double hitrate) {
        super(name, entry);
        this.innings = innings;
        this.hitrate = hitrate;
    }

    public void display() {
        super.showInfo();
        String message = innings + "개의 이닝으로 구성이 되며, 타율 " + hitrate + "를 기록하였습니다.";
        System.out.println(message);
    }
}
