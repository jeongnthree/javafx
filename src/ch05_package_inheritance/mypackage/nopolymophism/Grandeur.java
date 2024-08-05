package ch05_package_inheritance.mypackage.nopolymophism;

public class Grandeur {
    private String name ; // 이름
    private int price ; // 가격
    private double fuel ; // 연비
    private String remark ; // 연비에 대한 메모

    public Grandeur(String name, int price, double fuel) {
        this.name = name;
        this.price = price;
        this.fuel = fuel;

        if(fuel >= 20.0){
            this.remark = "excellent";
        }else if(fuel >= 15.0){
            this.remark = "good";
        }else{
            this.remark = "poor";
        }
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
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
