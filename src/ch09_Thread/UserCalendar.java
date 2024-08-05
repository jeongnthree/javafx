package ch09_Thread;

import java.text.DecimalFormat;
import java.util.Calendar;

public class UserCalendar {
    public UserCalendar() {
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int ampm = cal.get(Calendar.AM_PM);
        String sampm = ampm == 0 ? "오전" : "오후";

        // df는 숫자 2자리 형식으로 포맷팅해주는 객체
        String pattern = "00";
        DecimalFormat df = new DecimalFormat(pattern);

        String imsi = "현재 시각 : " + sampm + " " + df.format(hour) + "시 ";
        imsi += df.format(minute) + "분 "+ df.format(second) + "초 ";
        System.out.println(imsi);
    }
}
