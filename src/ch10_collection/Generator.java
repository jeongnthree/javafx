package ch10_collection;

import java.util.*;

public class Generator extends Thread {
    Map<String, Integer> map ;

    public Generator() {
        this.map = new HashMap<String, Integer>(); // 인스턴스 변수 초기화
    }

    @Override
    public void run() {
        System.out.println("데이터를 생성중입니다. \n잠시만 기다려 주세요.");
        String[] coffees = {"에스프레소", "콜드 브루", "아메리카노", "카페 라떼", "카푸치노", "마키야또"};

        for (int i = 0; i < 100 ; i++) {
            try {
                Thread.sleep(100);

                int idx = new Random().nextInt(coffees.length);
                String menu = coffees[idx];

                // 여기에서 map에 항목을 추가하는 코드 작성
                if (map.containsKey(menu) == true) {
                    int newvalue = map.get(menu) + 1 ;
                    map.put(menu, newvalue) ;
                }else{
                    map.put(menu, 1) ;
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("데이터가 생성되었습니다.");
        PrintResult();
    }

    private void PrintResult() {
        System.out.println("\n해당 결과를 출력합니다.");
        // 출력하세요.
        Set<String> keyList = map.keySet();

        // TreeSet를 이용하는 방법

//        for(String key:keyList){
//            int count = map.get(key);
//            String message = "%s---------%d\n";
//            System.out.printf(message, key, count);
//        }

        List<String> sortedLlist = new ArrayList<String>(keyList);
        Collections.sort(sortedLlist);

        for(String key:sortedLlist){
            int value = map.get(key) ;
            System.out.println(key + "\t" + value);
        }
    }
}
