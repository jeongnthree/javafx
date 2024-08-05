package ch09_Thread;

import java.text.DecimalFormat;
import java.util.Calendar;

public class Runnable01 implements Runnable {
    @Override
    public void run() {
        try{
            for (int i = 0; i < 100; i++) {
                Calendar cal = Calendar.getInstance();
                int hour = cal.get(Calendar.HOUR);
                int minute = cal.get(Calendar.MINUTE);
                int second = cal.get(Calendar.SECOND);

                String messgae = "현재 시간은 %s시 %s분 %s초입니다.\n";
                String pattern = "00";
                DecimalFormat df = new DecimalFormat(pattern);

                System.out.printf(messgae, df.format(hour), df.format(minute), df.format(second));
                Thread.sleep(2000);
            }
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
