package ch09_Thread;

import java.util.Random;

public class RandomCreator extends Thread {
    @Override // 개발자가 구현하고 싶은 내용은 여기에 적어 주세요.
    public void run() {
        Random rand = null ;
        try{
            rand = new Random();
            for (int i = 0; i < 20; i++) {
                Thread.sleep(1000);
                int jusawee = rand.nextInt(6) + 1 ;
                String imsi = (i+1) + "번째 주사위 눈금 : " + jusawee ;
                System.out.println(imsi);
            }

        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
