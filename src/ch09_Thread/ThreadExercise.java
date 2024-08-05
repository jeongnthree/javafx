package ch09_Thread;

public class ThreadExercise {
    public static void main(String[] args) {
        Thread01 soo = new Thread01("철수");
        soo.start();

        new Thread01("영희").start();

        Runnable01 mrun = new Runnable01();
        Thread th = new Thread(mrun); // 승급
        th.start();
    }
}
