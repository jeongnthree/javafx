package ch07_utility_classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndCalendar {
    private Date date = null ;
    private Calendar cal = null ;
    private SimpleDateFormat sdf = null ;
    private String pattern = null ;

    public DateAndCalendar(Date date) {
        this.date = date ;
    }

    public DateAndCalendar(Calendar cal) {
        this.cal = cal ;
    }

    public void getDateInfo() {
        this.pattern = "yyyy년 MM월 dd일 hh시 mm분 ss초" ;
        this.sdf = new SimpleDateFormat(pattern) ;
        String result = sdf.format(this.date) ;
        System.out.println("getDateInfo() 출력 결과");
        System.out.println(result);
    }

    public void getCalendarInfo() {
        long longdata = this.cal.getTimeInMillis() ;
        Date newdate = new Date(longdata) ;

        this.pattern = "오늘은 yyyy년 MM월 dd일이고, E요일이며," ;
        this.pattern += " 올해 D번째 날이며, w번째 주에 해당합니다." ;
        this.sdf = new SimpleDateFormat(pattern) ;
        String result = this.sdf.format(newdate) ;
        System.out.println(result);

        System.out.println();
        int year = this.cal.get(Calendar.YEAR) ;
        int month = this.cal.get(Calendar.MONTH) + 1 ;
        int day = this.cal.get(Calendar.DAY_OF_MONTH) ;
        int dayOfYear = this.cal.get(Calendar.DAY_OF_YEAR) ;
        int weekOfYear = this.cal.get(Calendar.WEEK_OF_YEAR) ;

        int dayOfWeek = this.cal.get(Calendar.DAY_OF_WEEK) ; // 요일 상수
        System.out.println("요일 상수 : " + dayOfWeek);

        String weekName = "" ; // 한글 요일 이름

        switch (dayOfWeek){
            case 1 : weekName = "일" ; break ;
            case 2 : weekName = "월" ; break ;
            case 3 : weekName = "화" ; break ;
            case 4 : weekName = "수" ; break ;
            case 5 : weekName = "목" ; break ;
            case 6 : weekName = "금" ; break ;
            case 7 : weekName = "토" ; break ;
        }

        System.out.println("Calendar 클래스의 필드 정보를 이용하여 출력하기");
        this.pattern = "오늘은 %d년 %d월 %d일이고, %s요일이며," ;
        this.pattern += " 올해 %d번째 날이며, %d번째 주에 해당합니다." ;
        System.out.printf(this.pattern, year, month, day, weekName, dayOfYear, weekOfYear);
    }
}
