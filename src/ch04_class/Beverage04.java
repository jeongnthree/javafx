package ch05_package_inheritance.mybeverage;

public class Beverage04 {
    private String name ;
    private double price ;

    public String getName() {
        return name;
    }

    public Beverage04(String name, double price) {
        this.name = name ;
        this.price = price ;
    }

    @Override
    public String toString() {
        String message = "음료 " + name + "의 단가는 " + price + "이고, ";
//        return super.toString() + "\n" + message ;
        return message ;
    }

    protected void showInfo() {
        System.out.println("\n음료 이름 : " + name);
        System.out.println("단가 : " + price);
    }
}
