package ch05_package_inheritance.mypackage.minishop;

public class Product {
    private int id ;
    private String name ;
    private int price ;
    private Category category ;
    private int stock ;
    private String description ;

    // onlyNamePrice() 메소드를 구현하되, 서브 클래스는 이를 변형하지 못하도록 해야 합니다.
    // 예시) 이름 : 바게트, 단가 : 1000원
    public final void onlyNamePrice(){
        String message = "이름 : %s, 단가 : %d원\n";
        System.out.printf(message, this.name, this.price);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String message = "" ;
        message += "이름(아이디) : " + this.name + "(" + this.id + ")\n" ;
        message += "가격 : " +  this.price + "원\n" ;
        message += "카테고리 : " + this.category.getKorname() + "(" + this.category + ")" + "\n" ;
        message += "재고 수량 : " + this.stock + "개\n" ;
        message += "상품 설명 : \n" ;
        message += this.description + "\n" ;
        return message;
    }

    public Product() {
    }

    public Product(int id, String name, int price, Category category, int stock, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
        this.description = description;
    }
}
