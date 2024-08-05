package ch04_class;

public class AccountMain04 {
    public static void main(String[] args) {
        Account04.bankname = "KB" ;

        Account04 soo = new Account04("김철수", 1234, 1000) ;
        soo.display();

        soo.deposit(5000); // 입금하기
        System.out.println("현재 잔액 : " + soo.getBalanceInfo());

        soo.withdraw(3000); // 출금하기
        System.out.println("현재 잔액 : " + soo.getBalanceInfo());

        System.out.println();
        Account04 hee = new Account04("박영희", 5678) ;
        hee.display();
    }
}