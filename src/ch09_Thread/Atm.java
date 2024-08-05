package ch09_Thread;

class Some2{}

public class Atm extends Some2 implements Runnable {
    private int balance ; // 잔액

    public Atm(int balance) {
        super();
        this.balance = balance ;
        System.out.println("최초 금액 : " + balance + "원");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            try{
                Thread.sleep(1000);
                // 50원 이상 150원 미만으로 인출하기
                int money = (int)(100.0 * Math.random() + 50.0);

                if(this.balance >= money && money != 0){
                    withdraw(money); // 인출하기

                }else{ // 인출 실패 알림
                    // 메소드 체이닝
                    String name = Thread.currentThread().getName() ;
                    System.out.println("잔액 부족");
                    System.out.println(name + "이(가) " + money + "원 인출 실패");

                    String imsi = "현재 잔액 : " + balance;
                    imsi += ", 인출 요구액 : " + money ;
                    System.out.println(imsi);
                    return ; // 진행중인 로직 그만 두시고 빠져 나가세요.
                }

            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

    private synchronized void withdraw(int money) { // 인출하는 동작 명시
        this.balance -= money ;
        Thread who = Thread.currentThread(); // 인출하는 쓰레드 정보
        String name = who.getName();
        System.out.print(name + "이(가) " + money + "원을 인출하여 ");
        System.out.println("통장 잔액이 " + this.balance + "원입니다.");
    }
}
