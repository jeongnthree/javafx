package ch05_package_inheritance.mypackage.minishop;

public class ProductMain {
    public static void main(String[] args) {
        Product[] products = {
            new Bread(1, "프렌치 바게트", 1000, Category.BREAD, 111,"프랑스의 대표적인 빵 중 하나로, 길쭉하고 얇은 형태의 식빵입니다. 바삭하면서도 촉촉한 식감과 진한 맛이 특징입니다.", Baked.MEDIUM_BAKED, 2),
            new Bread(2, "크로와상", 2000, Category.BREAD, 222,"프랑스의 대표적인 베이커리 중 하나로, 층층이 쌓인 반죽에 버터를 추가하여 구워낸 과자입니다.", Baked.WELL_BAKED, 5),
            new Beverage(3, "아메리카노", 3000, Category.BEVERAGE, 333,"에스프레소의 쓴 맛과 향을 좋아하는 사람들이 물을 추가해서 즐기는 음료로, 물과 에스프레소의 비율에 따라서 쓴 맛과 진하게 즐길 수 있습니다.", Volume.SMALL, false),
            new Beverage(4, "카푸치노", 4000, Category.BEVERAGE, 444,"스팀밀크와 거품을 올린 것을 섞어 만든 이탈리아의 전통적인 커피 음료입니다.", Volume.MEDIUM, true),
            new Cake(5, "스폰지 케이크", 5000, Category.CAKE, 555,"가장 일반적인 케이크로, 부드럽고 공기가 많은 스폰지 텍스처를 가지고 있습니다. 일반적으로 크림, 과일, 초콜릿 등 다양한 토핑과 함께 제공됩니다.", Flavor.VANILLA, true, 3),
            new Cake(6, "초콜릿 케이크", 6000, Category.CAKE, 666,"초콜릿으로 만든 케이크로, 풍부하고 진한 초콜릿 맛을 가지고 있습니다. 초콜릿으로 만든 케이크 스폰지와 초콜릿으로 만든 크림 또는 가나슈를 사용하여 제작됩니다.", Flavor.CARAMEL, false, 0)
        };

        for (int i = 0; i < products.length; i++) {
            System.out.println("-----------------------------");
            System.out.println(products[i]);
            products[i].onlyNamePrice();

            if(products[i] instanceof Bread){
                Bread bread = (Bread)products[i];
                bread.taste(1);

            }else if(products[i] instanceof Beverage){
                Beverage beverage = (Beverage)products[i];
                beverage.drink();

            }else if(products[i] instanceof Cake){
                Cake cake = (Cake)products[i];
                double salePrice = cake.purchase() ;
                System.out.println("구매가 : " + salePrice);
            }
        }
        System.out.println("program finished");
    }
}
