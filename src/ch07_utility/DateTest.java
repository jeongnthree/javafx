package ch07_utility_classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        String pattern = "hh시 mm분 ss초" ;

        // SimpleDateFormat 클래스는 날짜에 대한 서식을 간결하게 만들어 주는 포맷 클래스입니다.
        SimpleDateFormat sdf1 = new SimpleDateFormat(pattern) ;
        String now = sdf1.format(date) ;
        System.out.println(now);

        pattern = "yyyy년 MM月 dd일 hh:mm:ss" ;
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern) ;
        String curdate = sdf2.format(date) ;
        System.out.println(curdate);

        pattern = "오늘은 yyyy년 MM월 dd일이고 E요일이며," ;
        pattern += " 올해 D번째 날이며, w번째 주에 해당합니다." ;
        SimpleDateFormat sdf3 = new SimpleDateFormat(pattern) ;
        curdate = sdf3.format(date) ;
        System.out.println(curdate);

        pattern = "타임존(소문자) : z, 타임존(대문자) : Z, 타임존(대문자 엑스) : X" ;
        sdf3 = new SimpleDateFormat(pattern) ;
        curdate = sdf3.format(date) ;
        System.out.println(curdate);
		
        // 파싱할 '날짜 형태'의 문자열
        String dateString = "2023-08-01 15:50:25";
        pattern = "yyyy-MM-dd hh:mm:ss";
        SimpleDateFormat sdf4 = new SimpleDateFormat(pattern);

        try {
            // 문자열을 날짜 형식으로 파싱합니다.
            Date parsedDate = sdf4.parse(dateString);
            System.out.println("파싱된 날짜 : ");
            System.out.println(parsedDate);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
