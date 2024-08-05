package ch05_package_inheritance.mypackage.minishop;

public class Item { // 상품 1개를 의미하는 품목 클래스
    private String name ; // 상품 이름
    private Category category ; // 상품의 유형
    private int price ; // 단가

    public Item(String name, Category category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public void display(){
        System.out.println("이름 : " + this.name);
        System.out.println("타입 : " + this.category);
        System.out.println("한글 이름 : " + this.category.getKorname());
        System.out.println("단가 : " + this.price);
    }
}







