package ch09_Thread;

public class ThreadEx01 {
    public static void main(String[] args) {
        RandomCreator rc = null ;

        try {
            rc = new RandomCreator() ;
            rc.start();

            for (int i = 0; i < 20; i++) {
                Thread.sleep(1000);
                new UserCalendar();
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
