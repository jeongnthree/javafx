package ch10_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> coffeeList = new ArrayList<String>();

        coffeeList.add("아메리카노");
        coffeeList.add("카페라떼");
        coffeeList.add("에스프레소");
        coffeeList.add("마키야또");
        coffeeList.add("카페라떼");

        int idx = -1 ;
        String findData = "카페라떼";
        idx = coffeeList.indexOf(findData);
        System.out.println(findData + "의 색인 번호 : " + idx);

        idx = coffeeList.lastIndexOf(findData);
        System.out.println(findData + "의 색인 번호 : " + idx);

        findData = "카푸치노";
        idx = coffeeList.indexOf(findData);
        System.out.println(findData + "의 색인 번호 : " + idx);

        if(coffeeList.indexOf(findData) == -1){
            coffeeList.add(2, findData);
        }

        System.out.println("\n확장 for를 이용한 출력");
        for(String coffee : coffeeList){
            System.out.print(coffee + "\t");
        }
        System.out.println();

        findData = "콜드 브루";
        coffeeList.set(5, findData);

        findData = "카푸치노";
        coffeeList.remove(findData);

        idx = 3 ;
        String what = coffeeList.get(idx);
        System.out.println(idx + " 번째 요소 : " + what);

        findData = "카푸치노";
        coffeeList.add(findData);
        PrintGet(coffeeList);

        System.out.println("\n오름차순 정렬하기");
        Collections.sort(coffeeList);
        PrintGet(coffeeList);

        System.out.println("특정 요소 2개를 서로 맞바꾸기");
        Collections.swap(coffeeList, 2, 5);
        PrintGet(coffeeList);

        System.out.println("\n부분 집합 추출하기");
        List<String> first = coffeeList.subList(1, 3);
        System.out.println(first);

        List<String> second = coffeeList.subList(4, 6);
        System.out.println(second);

        List<String> totalList = new ArrayList<String>();
        totalList.addAll(first);
        totalList.addAll(second);
        System.out.println(totalList);

        System.out.println("\n내림차순 정렬하기");
        Collections.sort(coffeeList, Collections.reverseOrder());
        PrintGet(coffeeList);

        System.out.println("\n무작위로 섞기");
        Collections.shuffle(coffeeList);
        PrintGet(coffeeList);

        findData = "카푸치노";
        int cnt = Collections.frequency(coffeeList, findData);
        System.out.println(findData + " 빈도 수 : " + cnt);

        coffeeList.clear();

        String[] arr = {"카페라떼", "마키야또", "에스프레소", "아메리카노"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                coffeeList.add(arr[i]);
            }
        }
        Collections.shuffle(coffeeList);
        System.out.println(coffeeList.toString());

        for (int i = 0; i < arr.length; i++) {
            cnt = Collections.frequency(coffeeList, arr[i]);
            String message = "%s의 빈도 수 : %d\n";
            System.out.printf(message, arr[i], cnt);
        }
        System.out.println();

        System.out.println("요소 개수 : " +  coffeeList.size());
    }

    private static void PrintGet(List<String> qwert) {
        System.out.println("get 메소드를 이용한 출력 방식");
        for (int i = 0; i < qwert.size(); i++) {
            String imsi = qwert.get(i) ;
            System.out.print(imsi + "\t");;
        }
        System.out.println();

    }
}
