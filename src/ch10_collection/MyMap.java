package ch10_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("lg", 1) ;
        map.put("ssg", 2) ;
        map.put("두산", 3) ;
        map.put("kt", 4) ;

        String findItem = "nc" ;
        boolean bool = map.containsKey(findItem) ;
        System.out.println(findItem + " 팀이 목록에 있나요 ? " + bool );

        // nc 팀이 존재하는 지 체크하고, 없으면 순위 5위로 추가하세요.
        if(map.containsKey(findItem) == false){
            map.put(findItem, 5) ;
        }

        // 순위가 6위인 팀이 존재하는 지 체크하고, 존재하지 않으면 'kia'를 추가해주세요.
        final int pos = 6 ;
        if(map.containsValue(pos) == true){
            System.out.println(pos + "위 팀은 존재합니다.");
        }else{
            System.out.println(pos + "위 팀은 존재하지 않아서 추가합니다.");
            map.put("kia", pos) ;
        }

        String[] teams = {"롯데", "한화", "키움", "삼성"};
        for (int i = 0; i < 4; i++) { // 7위부터 10위까지...
            map.put(teams[i], i + 7) ;
        }

        findItem = "한화" ;
        Integer rank = map.get(findItem) ;
        String message = "팀명 : %s, 순위 : %d\n" ;
        System.out.printf(message, findItem, rank);

        // '두산'과 'kt' 팀의 순위 정보 확인(배열 사용)
        String[] findTeams = {"두산", "kt", "빙그레"};
        for(String one:findTeams){
            rank = map.get(one);
            if(rank != null){
                message = "팀명 : %s, 순위 : %d\n" ;
                System.out.printf(message, one, rank);
            }else{
                System.out.println(one + " 팀이 존재하지 않아서, 추가하겠습니다.");
                map.put(one, 11) ;
            }
        }

        System.out.println("\n전체 목록을 출력합니다.");
        Set<String> keySet = map.keySet() ;
        for(String key:keySet){
            rank = map.get(key);
            message = "Team : %S, Rank : %d\n" ;
            System.out.printf(message, key, rank);
        }

        map.remove("빙그레");

        // 'nc'와 '삼성'은 순위를 1빼기, 'lg'는 순위를 1더하기 해보세요.
        Set<String> items = map.keySet();
        for(String key:items){
            Integer value = map.get(key) ;
            if(key.equalsIgnoreCase("nc") || key.equalsIgnoreCase("삼성")){
                map.put(key, value - 1);
            }else if(key.equalsIgnoreCase("lg")){
                map.put(key, value + 1);
            }else{

            }
        }

        System.out.println("요소 개수 : " + map.size());
        System.out.println("toString() 메소드 : " + map.toString());

        map.clear();
        if(map.isEmpty()){
            System.out.println("map is empty");
        }else{
            System.out.println("map is not empty");
        }
    }
}
