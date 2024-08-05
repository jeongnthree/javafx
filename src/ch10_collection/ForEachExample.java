package ch10_collection;

//import ch07_utility_classes.classex.Human;

import java.util.*;

public class ForEachExample {
    public static void main(String[] args) {
        System.out.println("array forEach");
        String[] strArray = {"경기", "충청", "경상"};
        Arrays.stream(strArray).forEach((item) -> {
            System.out.println(item) ;
        });

        Set<String> cities = new HashSet<>() ;
        cities.add("paris");
        cities.add("seoul");
        cities.add("tokyo");

        System.out.println("set forEach");
        cities.forEach((item)->{
            System.out.println(item);
        });

        List<String> lists = new ArrayList<>();
        lists.add("서울");
        lists.add("대전");
        lists.add("대구");

        System.out.println("\nlist forEach");
        lists.forEach((item) -> {
            System.out.println(lists.indexOf(item) + " : " + item);
        });

        List<Board> boardList = new ArrayList<Board>();
        Board lee = new Board(10, "여름 폭염", "이재선", "2024/07/08", 5);
        Board sim = new Board(9, "우크라이나 전쟁", "심수련", "2024/03/01", 3);
        Board yoon = new Board(8, "장마", "윤정혁", "2024/08/15", 8);
        boardList.add(lee);
        boardList.add(sim);
        boardList.add(yoon);

        System.out.println("\nlist forEach 2");
        boardList.forEach((bean) -> {
            int no = bean.getNo() ;
            String title = bean.getTitle() ;
            String writer = bean.getWriter();
            String regdata = bean.getRegdate();
            int readhit = bean.getReadhit() ;
            String message = "%d\t%s\t%s\t%s\t%d\n" ;
            System.out.printf(message, no, title, writer, regdata, readhit);
        });

        Map<String, String> map = new HashMap<String, String>();
        map.put("문재혁", "민주당");
        map.put("홍진희", "한국당");
        map.put("안유성", "애민당");

        System.out.println("\nmap forEach");
        map.forEach((strKey, strValue) -> {
            System.out.println(strKey + " : " + strValue);
        });
    }
}
