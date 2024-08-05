package ch05_package_inheritance.mypackage.minishop;

public class Bread extends Product{
    private Baked baked ;
    private int cut ; // 자른 조각수

//    @Override
//    public void onlyNamePrice() {
//        System.out.println("메롱");
//    }

    @Override
    public String toString() {
        String message = "" ;
        message += "빵 구워진 정도 : " + this.baked.getBakedStatus() + "\n";
        message += "조각 수 : " + this.cut + " 조각\n";
        return super.toString() + message ;
    }

    public void taste(int cut){ // 시식하기
        // 빵은 조각 수(cut) 내의 범위에 대하여 시식이 가능합니다.
        System.out.println("시식 요청 빵 개수 : " + cut);
        if(this.cut < cut){
            System.out.println("시식할 빵 개수가 부족합니다.");
        }else{
            String message = "%s를(을) %d개 시식합니다.\n";
            System.out.printf(message, super.getName(), cut);
        }
    }

    public Bread(int id, String name, int price, Category category, int stock, String description, Baked baked, int cut) {
        super(id, name, price, category, stock, description);
        this.baked = baked;
        this.cut = cut;
    }
}
