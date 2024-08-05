package ch06_abstract_interface.myshape.beberagetest;

public class BeverageMain {
    public static void main(String[] args) {
    Beverage05[] beverage05 = {
            new Americano05("아메리카노", 4000.0, 250.0),
            new Espresso05("에스프레소", 5000.0, 2),
            new Latte05("라떼", 6000.0, "아몬드 우유")
    };

        for (int i = 0; i < beverage05.length; i++) {
            beverage05[i].showData();

            beverage05[i].dink();
            beverage05[i].make();
            System.out.println();
        }


    }
}
