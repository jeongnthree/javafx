package ch09_Thread;

public class ThreadTest {
    public static void main(String[] args) {
        ThreadEx soo = new ThreadEx("철수");
        soo.start();

        new ThreadEx("영희").start();

        RunnableEx mrun = new RunnableEx();
        Thread th = new Thread(mrun); // 승급
        th.start();
    }
}
