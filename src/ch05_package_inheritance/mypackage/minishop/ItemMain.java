package ch05_package_inheritance.mypackage.minishop;

public class ItemMain {
    public static void main(String[] args) {
        Item item01 = new Item("소보루", Category.BREAD, 1000);
        item01.display();

        Item item02 = new Item("바닐라케익", Category.CAKE, 5000);
        item02.display();

        Item item03 = new Item("아메리카노", Category.BEVERAGE, 3000);
        item03.display();

        int[] arr = {10, 50, 30};

        // FIFO : First Input First Output
        // LIFO : Last Input First Output
        // 향상(확장) for 구문
        // for(타입 단수 : 복수){
        for(int item : arr){
            System.out.println(item);
        }

        System.out.println("케이크 열거형 상수 정보");
        for(Flavor item : Flavor.values()){
            System.out.println("타입 : " + item + ", 색인 값 : " + item.ordinal());
            String message = "한글 이름 : " + item.getKorname() + ", 맛 : " + item.getComment() ;
            System.out.println(message);
        }

        System.out.println("특정 항목 추출");
        Flavor myflavor = Flavor.valueOf("CHOCOLATE");
        String temp = myflavor.getKorname() + "/" + myflavor.getComment() ;
        System.out.println(temp);

        System.out.println("빵굽기 열거형 상수 정보");
        for(Baked item : Baked.values()){
            System.out.println("타입 : " + item + ", 색인 값 : " + item.ordinal());
            String message = "한글 이름 : " + item.getBakedStatus() ;
            System.out.println(message);
        }

        System.out.println("특정 항목 추출");
        Baked mybaked = Baked.valueOf("MEDIUM_BAKED");
        String temp2 = mybaked.getBakedStatus() ;
        System.out.println(temp2);
    }
}







