package ch09_Thread;

public class ThreadMainEx {
    public static void main(String[] args) {
        //System.out.println(3/0);
        // currThread는 현재 수행되고 있는 쓰레드를 지칭하는 객체
        Thread currThread = Thread.currentThread();
        long id = currThread.getId();
        System.out.println("쓰레드 id : " + id);

        String name = currThread.getName();
        System.out.println("쓰레드 이름 : " + name);

        // time sharing 작업 : 시간을 잘게 쪼개서 여러 개의 쓰레드를 실행시키는 작업
        // priority는 time sharing 작업에서 작업의 우선 순위를 결정합니다.
        // 1 <= priority <= 10
        int priority = currThread.getPriority() ;
        System.out.println("쓰레드 우선 순위 값 : " + priority);

        System.out.println("하하하");
        int wait = 3000 ;
        System.out.println(wait/1000 + "초 동안 대기합니다.");

        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("호호호");
    }
}
