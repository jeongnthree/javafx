package ch07_utility_classes;

import java.util.Calendar;

public class MyTest {
    @Override
    public String toString() {
        Calendar now = Calendar.getInstance() ;
        int month = now.get(Calendar.MONTH) + 1 ;
        int day = now.get(Calendar.DAY_OF_MONTH) ;

        String imsi = "금일은 " + month + "월 " + day + "일입니다." ;
        return imsi ;
    }
}
