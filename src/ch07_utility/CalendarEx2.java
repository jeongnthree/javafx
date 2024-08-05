package ch07_utility_classes;

import java.util.Calendar;

public class CalendarEx2 {
    public static void main(String[] args) {
        String today = "202202" ; // 년월
        int year = Integer.parseInt(today.substring(0, 4)) ;
        int month = Integer.parseInt(today.substring(4, 6)) ;
        int day = 1 ;
        // cal : 금월 1일을 나타내기 위한 객체
        Calendar cal = Calendar.getInstance() ;
        cal.set(year, month-1, day); // 금월의 첫째 날로 셋팅

        int lastday = cal.getActualMaximum(cal.DATE) ; // 금월의 마지막 날짜
        System.out.println("금월의 마지막 날짜 : " + lastday);

        // 요일 상수 : 일요일(1)~토요일(7)
        int weekconst = cal.get(cal.DAY_OF_WEEK) ;
        System.out.println("요일 상수 : " + weekconst);

        System.out.println(year + "년 " + month + "월 달력");
        System.out.println("===================================");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        final String TAB_KEY = "\t" ; // 분리 구분자
		
        for (int i = 1; i < weekconst ; i++) {
            //System.out.println("탭 눌렀슴");
            System.out.print(TAB_KEY);
        }
        for (int i = 1; i <= lastday; i++) {
            System.out.print(i + TAB_KEY);
            if((i+weekconst-1) % 7 ==0){
                System.out.println() ;
            }
        }
    }
}