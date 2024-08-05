package ch10_collection;

import java.util.*;

public class ForEachTest {
    public static void main(String[] args) {
        System.out.println("\narray forEach");
        String[] strArray = {"경기", "충청", "전라", "경상"};

        // 람다식 : (매개변수)->{내가 할일}
        // 익명 함수
        Arrays.stream(strArray).forEach((item)->{
            System.out.println(item);
        });

        System.out.println("\nset forEach");
        Set<String> cities = new HashSet<String>();
        cities.add("paris");
        cities.add("seoul");
        cities.add("tokyo");

        cities.forEach((item)->{
            System.out.println(item);
        });

        Set<Board> boardSet = new HashSet<Board>();

        Board lee = new Board(10, "여름 폭염", "이재선", "2024/07/08", 5);
        Board sim = new Board(9, "우크라이나 전쟁", "심수련", "2024/03/01", 3);
        Board yoon = new Board(8, "장마", "윤정혁", "2024/08/15", 8);

        boardSet.add(lee);
        boardSet.add(sim);
        boardSet.add(yoon);

        System.out.println("\nboardSet 출력하기");
        boardSet.forEach((bean)->{
            printData(bean);
        });


        System.out.println("\nlist forEach");
        List<String> lists = new ArrayList<String>();
        lists.add("서울");
        lists.add("대전");
        lists.add("대구");
        lists.add("광주");

        lists.forEach((item)->{
            System.out.println(item);
        });

        System.out.println("\nboardList 출력하기");
        List<Board> boardList = new ArrayList<Board>();
        boardList.add(lee);
        boardList.add(sim);
        boardList.add(yoon);
        boardList.add(new Board(7, "서이 초등학교", "금잔디", "2024/12/25", 4));
        boardList.add(new Board(6, "남극 탐험", "이강산", "2024/11/11", 11));

        boardList.forEach((bean)->{
            printData(bean);
        });

        System.out.println("\nmap forEach");
        Map<String, String> map = new HashMap<String, String>();
        map.put("문재혁", "민자당");
        map.put("홍진희", "한국당");
        map.put("안유성", "애민당");

        map.forEach((key, value)->{
            String message = "키:%s, 값:%s\n" ;
            System.out.printf(message, key, value);
        });

        System.out.println("\nboardMap 출력하기");
        Map<String, Board> boardMap = new HashMap<String, Board>();
        boardMap.put("black", lee);
        boardMap.put("yellow", sim);
        boardMap.put("red", yoon);
        boardMap.put("green", new Board(7, "서이 초등학교", "금잔디", "2024/12/25", 4));
        boardMap.put("skyblue", new Board(6, "남극 탐험", "이강산", "2024/11/11", 11));

        boardMap.forEach((color, bean)->{
            System.out.println("키:" + color);
            System.out.println("값:");
            printData(bean);
        });
    }

    private static void printData(Board bean) {
        int no = bean.getNo() ;
        String title = bean.getTitle() ;
        String writer = bean.getWriter() ;
        String regdate = bean.getRegdate() ;
        int readhit = bean.getReadhit();
        String message = "%d\t%s\t%s\t%s\t%d\n" ;
        System.out.printf(message, no, title, writer, regdate, readhit);
    }
}
