package ch10_collection;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class MyMapExam {
    public static void main(String[] args) {
//        // 문자열을 숫자로 바꾸는 방법
//        String a="10", b="12.34";
//
//        // Integer.valueOf("100")
//        int aa = Integer.parseInt(a);
//        System.out.println("정수 : " + (aa+50));
//
//        // Double.valueOf("123.456")
//        double bb = Double.parseDouble(b);
//        System.out.println("실수 : " + (bb + 10.0));
//
//        int total = 150 ;
//        String newTotal = String.valueOf(total);
//        System.out.println("문자열 : " + newTotal);
//
//        double cc = 12.345678 ;
//        String ccc = new DecimalFormat("###.00").format(cc);
//        System.out.println("문자열 : " + ccc);

        Map<String, String> map = new HashMap<>();
        map.put("이름", "홍길동") ;
        map.put("국어", "60") ;
        map.put("영어", "80") ;

        System.out.println("before map");
        System.out.println(map.toString());

        // 여기에 코딩
        String[] subject = {"국어", "영어", "수학"};
        final String default_jumsu = "80" ;
        for(String item:subject){
            if(map.containsKey(item) == false){
                map.put(item, default_jumsu);
            }
        }
        int kor = Integer.parseInt(map.get("국어"));
        int eng = Integer.parseInt(map.get("영어"));
        int math = Integer.parseInt(map.get("수학"));
        int total = kor + eng + math ;
        double average = (double)total / 3.0 ;

        String grade = "";
        if(average >= 90.0){
            grade = "A" ;
        }else if(average >= 80.0){
            grade = "B" ;
        }else if(average >= 70.0){
            grade = "C" ;
        }else if(average >= 60.0){
            grade = "D" ;
        }else{
            grade = "F" ;
        }

        map.put("총점", String.valueOf(total));
        map.put("평균", new DecimalFormat("###.00").format(average));
        map.put("학점", grade);


        System.out.println("after map");
        System.out.println(map.toString());

    }
}
