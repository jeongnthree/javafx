package ch05_package_inheritance.mypackage.minishop;

public class Cake extends Product{
    private Flavor flavor ; // 케이크의 맛향
    private boolean isSliced ; // 케이크 잘림 여부
    private int slices ; // 자른 조각수

    @Override
    public String toString() {
        String message = "";
        message += "맛 평가 : " + this.flavor.getKorname() + "(" + this.flavor + ")는 " + this.flavor.getComment() + "\n";
        message += "조각 여부 : " + (this.isSliced ? "잘라짐" : "안 잘라짐") + "";
        if(isSliced){
            message += "\n";
            message += "등분 : " + this.slices + "";
        }
        return super.toString() + message;
    }

    public double purchase(){
        // 케이크는 6,000원 이상이면 20% 할인, 미만이면 10% 할인 적용하여 구매가 가능합니다.
        double rate = super.getPrice() >= 6000.0 ? 0.2 : 0.1 ; // 할인율
        return super.getPrice() * (1.0 - rate) ;
    }

    public Cake(int id, String name, int price, Category category, int stock, String description, Flavor flavor, boolean isSliced, int slices) {
        super(id, name, price, category, stock, description);
        this.flavor = flavor;
        this.isSliced = isSliced;
        this.slices = slices;
    }
}
