package ch09_Thread;

import java.util.Random;

public class Thread01 extends Thread{
    @Override
    public void run() {
        Random random = null ;
        try{
            random = new Random();

            for (int i = 0; i < 100; i++) {
                Thread.sleep(3000);
                int su01 = random.nextInt(10) + 1 ;
                int su02 = random.nextInt(10) + 1 ;

                int max = Integer.max(su01, su02);

                String message = "%d와 %d 중에서 큰 수는 %d입니다.\n" ;
                System.out.printf(message, su01, su02, max);
            }
        }catch (InterruptedException e){
            e.printStackTrace();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Thread01(String name) {
        super(name);
    }
}
