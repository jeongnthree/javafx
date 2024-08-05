package ch05_package_inheritance.mypackage.minishop;

public class Beverage extends Product { // 음료수 클래스
    private Volume volume ; // 용량
    private boolean isHot ; // 뜨거우면 true

    @Override
    public String toString() {
        String message = "" ;
        message += "용량 : " + this.volume.getMilimeters() + "ml\n" ;
        message += "용량 멘트 : " + this.volume.getComment() + "\n" ;
        message += "상태 : " + (this.isHot ? "뜨거운 음료" : "차가운 음료") +"\n" ;
        return super.toString() + message;
    }

    public void drink(){// 시음하기
        String message = "음료 \'%s\'를 시음합니다.\n";
        System.out.printf(message, super.getName());
        if(this.isHot){
            System.out.println("뜨거우니 조심하세요.");
        }else{
            System.out.println("차가우니 배탈 조심하세요.");
        }
    }

    public Beverage(int id, String name, int price, Category category, int stock, String description, Volume volume, boolean isHot) {
        super(id, name, price, category, stock, description);
        this.volume = volume;
        this.isHot = isHot;
    }
}
