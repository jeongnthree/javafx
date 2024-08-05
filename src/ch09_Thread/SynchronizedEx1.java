package ch09_Thread;

public class SynchronizedEx1 {
    public static void main(String[] args) {
        int money = 1000;
        Atm atm = new Atm(money);

        Thread soo = new Thread(atm, "김철수"); // 승급
        Thread hee = new Thread(atm, "박영희");

        soo.start();
        hee.start();
    }
}
