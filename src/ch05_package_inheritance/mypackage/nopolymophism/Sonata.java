package ch05_package_inheritance.mypackage.nopolymophism;

public class Sonata {
    private String name ; // 이름
    private int price ; // 가격
    private String maker ; // 제조 회사(메이커)

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getMaker() {
        return maker;
    }

    public Sonata() {
    }

    public Sonata(String name, int price, String maker) {
        this.name = name;
        this.price = price;
        this.maker = maker;
    }
}
