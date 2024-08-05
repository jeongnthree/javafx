package ch07_utility_classes;

import java.util.Calendar;
import java.util.Date;

public class DateConverter {
    public static void main(String[] args) {
        System.out.println("도전01:Date 타입을 Calendar 타입으로 변환해 보기");
        Date date = new Date() ;
        DateAndCalendar object1 = new DateAndCalendar(date);
        object1.getDateInfo();
        System.out.println("----------------------------------------");
        System.out.println("도전02:Calendar 타입을 Date 타입으로 변환해 보기");
        Calendar cal = Calendar.getInstance() ;
        DateAndCalendar object2 = new DateAndCalendar(cal);
        object2.getCalendarInfo();
    }
}