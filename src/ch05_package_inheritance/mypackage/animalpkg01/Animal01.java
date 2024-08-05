package ch05_package_inheritance.mypackage.animalpkg01;

public class Animal01 {
    private String name ;
    private int lifespan;
    private String habitat ;
    private int speed ;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Animal01(String name, int lifespan, String habitat , int speed) {
        this.name = name ;
        this.lifespan = lifespan ;
        this.speed = speed ;
        this.habitat = habitat ;
    }

    public void showInfo() {
        String message = "" ;
        message += "평균 수명이 " + lifespan + "인 " + name + "의 ";
        message += " 서식지는 " + habitat + "입니다." ;
        System.out.println(message);
    }
}
