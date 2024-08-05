package ch09_Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadEx extends Thread{
    @Override
    public void run() {
        // 3초 간격으로 100번만 현재 시각을 출력해 봅니다.
        try{
            for (int i = 0; i < 100; i++) {
                Thread.sleep(3000);
                Date date = new Date();
                String pattern = super.getName() + "의 쓰레드 시각 : hh시 mm분 ss초";

                // SimpleDateFormat : 날짜에 대한 서식을 제공해주는 클래스
                // 패턴 문자열(pattern letters)에 대한 공부 필요
                SimpleDateFormat sdf = new SimpleDateFormat(pattern);
                String now = sdf.format(date);
                System.out.println(now);

            }
        }catch (InterruptedException e){
            e.printStackTrace();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ThreadEx(String name) {
        // name 변수는 쓰레드들을 구분할 이름(식별자)입니다.
        super(name);
    }


}
