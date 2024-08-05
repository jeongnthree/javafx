package ch09_Thread;

import java.util.Random;

class Some{}

public class RunnableEx extends Some implements Runnable{
    @Override
    public void run() {
        String[] arr = {"이효리", "이문세", "소녀시대", "블랙핑크", "SES"} ;

        try{
            for (int i = 0; i < 100; i++) {
                String item = arr[new Random().nextInt(arr.length)];
                String comment = "배열 요소 : " ;
                System.out.println(comment + item);
                Thread.sleep(2000);
            }
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
