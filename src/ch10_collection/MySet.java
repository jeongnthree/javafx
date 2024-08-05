package ch10_collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<Object>();


        // Boxing : 기본 자료형이 참조 자료형으로 변환(opp : UnBoxing)

        set.add("아메리카노"); // 승급(String -> Object)
        set.add(123); // 승급(int -> Integer -> Object)
        set.add(false); // 승급(boolean -> Boolean -> Object)
        set.add("아메리카노");

        set.clear();
        set.add("아메리카노");
        set.add("에스프레소");
        set.add("믹스커피");
        set.add("카페라떼");

        String findData = "카푸치노";
        System.out.println(findData + " 존재 여부 : " + set.contains(findData));

        String addData = "마끼야또"; // 존재하지 않으면 추가해 보세요.
        if(set.contains(addData) == false){
            set.add(addData);
        }

        findData = "믹스커피";
        if(set.remove(findData)){
            System.out.println(findData + " 삭제 성공");
        }else{
            System.out.println(findData + " 는 목록에 존재하지 않는군요.");
        }

        System.out.println("확장 for 사용하기");
        for(Object coffee:set){
            System.out.println(coffee);
        }

        System.out.println("toString() : " + set);
        System.out.println("요소 갯수 : " + set.size());

        System.out.println("set를 배열로 변경하기");
        Object[] arr = set.toArray();
        for(Object coffee:arr){
            System.out.println(coffee);
        }

        Set<Integer> setA = new HashSet<Integer>();
        for (int i = 1; i <= 4 ; i++) {
            setA.add(i);
        }

        Set<Integer> setB = new HashSet<Integer>();
        for (int i = 3; i <= 6 ; i++) {
            setB.add(i);
        }

        Set<Integer> union = new HashSet<Integer>();
        union.addAll(setA);
        union.addAll(setB);
        System.out.println("합집합 : " + union);

        Set<Integer> intersection = new HashSet<Integer>(setA);
        intersection.retainAll(setB);
        System.out.println("교집합 : " + intersection);

        Set<Integer> minus01 = new HashSet<Integer>(setA);
        minus01.removeAll(setB);
        System.out.println("차집합(A-B) : " + minus01);

        Set<Integer> minus02 = new HashSet<Integer>(setB);
        minus02.removeAll(setA);
        System.out.println("차집합(B-A) : " + minus02);

        System.out.println("컬렉션 중에서 Tree로 시작하는 항목들은 정렬을 수행합니다.");
        Set<String> sortCoffee = new TreeSet<String>();
        sortCoffee.add("에스프레소");
        sortCoffee.add("카페라떼");
        sortCoffee.add("카푸치노");
        sortCoffee.add("마끼야또");
        sortCoffee.add("아메리카노");

        for(String coffee: sortCoffee){
            System.out.print(coffee + "\t");
        }
    }
}








