package ch05_package_inheritance.mypackage.polymorphism;

public class Grandeur extends Car {
    private double fuel ; // 연비
    private String remark ; // 연비에 대한 메모

    public Grandeur(String name, int price, double fuel) {
        super(name, price);
        this.fuel = fuel;

        if(fuel >= 20.0){
            this.remark = "excellent";
        }else if(fuel >= 15.0){
            this.remark = "good";
        }else{
            this.remark = "poor";
        }
    }

    public double getFuel() {
        return fuel;
    }

    public String getRemark() {
        return remark;
    }

    public Grandeur() {
    }
}
