package ch05_package_inheritance.mybeverage;

public class InheTest04 {
    public static void main(String[] args) {
        // 승급 : 낮은 등급의 클래스가 높은 등급의 클래스 타입으로 한시적으로 형태가 바뀌는 동작
        //슈퍼  객체  =  new  서브();
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 250.0);

        // 슈퍼 클래스내에 들어 있는 메소드는 상속 개념에 의하여 접근이 가능합니다.
        beverage01.showInfo();

        // 승급이 되면 한시적으로 서브 클래스 내의 메소드는 접근이 불가능합니다.
        // 접근하려면, 반드시 원래 타입으로 강등해야만 합니다.
        Americano04 americano = (Americano04)beverage01 ;
        americano.sipAmericano();

        Beverage04 beverage02 = new Espresso04("에스프레소", 5000.0, 2);
        beverage02.showInfo();

        Espresso04 espresso = (Espresso04)beverage02 ;
        espresso.drinkEspresso();

        Beverage04 beverage03 = new Latte04("라떼", 6000.0, "아몬드 우유");
        beverage03.showInfo();
        Latte04 latte = (Latte04)beverage03 ;
        latte.enjoyLatte();

        // 승급 개념과 배열 같이 사용하기
        Beverage04[] beverage = {
                beverage01,
                new Espresso04("마이뿌레소", 2000.0, 1),
                new Latte04("latte", 3000.0, "바나나 우유"),
        };

        for (int i = 0; i < beverage.length; i++) {
            System.out.println("--------------------------");
            beverage[i].showInfo();

            // 승급된 객체 변수가 수많은 서브 클래스 중에서 어떤 클래스로 생성이 되었는 지를 판단하고자 할때 사용되는 연산자입니다.
            // boolean 타입을 반환하므로 주로 다중 택일 if 구문과 같이 사용됩니다.
            if(beverage[i] instanceof Americano04){
                Americano04 america = (Americano04)beverage[i] ; // 강등
                america.sipAmericano();

            }else if(beverage[i] instanceof Espresso04){
                Espresso04 espress = (Espresso04)beverage[i];
                espress.drinkEspresso();

            }else if(beverage[i] instanceof Latte04){
                Latte04 late = (Latte04)beverage[i];
                late.enjoyLatte();
            }else{

            }
        }

        // 메소드 호출시 승급
        printDataInfo(beverage01); // 아메리카노
        printDataInfo(beverage02); // 에스프레스
        printDataInfo(beverage03); // 라떼
    }

    private static void printDataInfo(Beverage04 bev) {
        // 객체 정보를 출력합니다.
        // Object 클래스는 모든 서브 클래스가 객체 정보를 출력할 수 있다록 toString() 메소드를 미리 구비해 두고 있습니다.
        //System.out.println(bev);
        System.out.println(bev.toString()); // 객체의 문자열 정보 출력
    }
}
