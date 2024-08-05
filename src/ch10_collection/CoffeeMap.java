package ch10_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CoffeeMap {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<String, Double>();

        map.put("에스프레소", 1111.0);
        map.put("카페라떼", 2222.0);
        map.put("카푸치노", 3333.0);
        map.put("마끼야또", 4444.0);

        String findItem = "카페라떼" ;
        boolean bool = map.containsKey(findItem);
        String message = findItem + " 품목이 목록에 " + (bool ? "있습니다." : "없습니다");
        System.out.println(message);

        findItem = "핫초코" ; // 존재하는 지 체크하고, 없으면 5555.0으로 추가하세요.
        if(map.containsKey(findItem) == false){
            map.put(findItem, 5555.0);
        }

        // 가격이 6666.0인 품목이 존재하면, '품목이 존재합니다'라고 출력하고,
        // 존재하지 않으면 '아이스커피'를 가격과 함께 추가해 주세요.
        findItem = "아이스커피" ;
        Double price = 6666.0 ;

        if(map.containsValue(price) == true){
            System.out.println(findItem + "은(는) 존재하는 상품입니다.");

        }else{
            System.out.println(findItem + "은(는) 존재하지 않는 상품이라거 추가합니다.");
            map.put(findItem, price);
        }

        System.out.println("배열과 반복문을 이용하여 요소를 몇개 더 추가합니다.");
        String[] arrCoffee = {"바닐라라떼", "라벤더", "딸기라떼", "콜드 브루"} ;

        for (int i = 0; i < arrCoffee.length; i++) {
            map.put(arrCoffee[i], (i + 7.0) * 1111.0);
        }

        findItem = "아이스커피" ;
        price = map.get(findItem);

        message = findItem + "의 단가는 " + price + "입니다.";
        System.out.println(message);

        // get() 메소드로 항목을 찾지 못하면 null을 반환합니다.
        findItem = "쭈쭈바" ;
        price = map.get(findItem);

        if(price != null){
            message = findItem + "의 단가는 " + price + "입니다.";
            System.out.println(message);

        }else{
            System.out.println(findItem + "은 존재하지 않습니다.");
        }

        // 배열 findCoffee의 각각의 요소가 존재하면, '품명 : xx, 가격 : yy' 형식으로 가격 정보를 출력하고,
        // 존재하지 않으면, 상품을 단가 5000.0원으로 추가하도록 하는 코드를 작성해 보세요.
        String[] findCoffee = {"라벤더", "우유커피", "카푸치노"};

        for(String key:findCoffee){
            price = map.get(key);
            if(price != null){
                message = "품명 : %s, 가격 : %.2f\n";
                System.out.printf(message, key, price);

            }else{
                System.out.println(key + "은 존재하지 않아서, 추가하도록 하겠습니다.");
                map.put(key, 5000.0) ;
            }
        }

        System.out.println("전체 목록을 출력해 봅니다.");

        Set<String> keyList = map.keySet();

        for(String key:keyList){
            price = map.get(key);
            message = "품명 : %s, 가격 : %.2f\n";
            System.out.printf(message, key, price);
        }

        map.remove("우유커피");

        String data01 = new String("aaa");
        String data02 = new String("aaa");
        System.out.println("data01 == data02 : " + (data01 == data02));
        System.out.println("data01.equals(data02) : " + data01.equals(data02));

        // '콜드 브루', '카페라떼'는 가격을 1000원 빼고,
        // '에스프레소'는 가격을 1000원 더해 주세요.
        for(String key:keyList){
            price = map.get(key); // 현재 단가

            if(
                key.equalsIgnoreCase("콜드 브루")
                ||
                key.equalsIgnoreCase("카페라떼")){
                map.put(key, price - 1000.0) ;
            }else if(key.equalsIgnoreCase("에스프레소")){
                map.put(key, price + 1000.0) ;
            }else{

            }
        }

        System.out.println("map.toString() : " + map.toString());
        System.out.println("요소 개수 : " + map.size());

        map.clear();
        if(map.isEmpty()){
            System.out.println("map is empty");
        }else{
            System.out.println("map is not empty");
        }
    }
}
