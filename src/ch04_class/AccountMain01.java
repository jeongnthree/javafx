package ch04_class;

public class AccountMain01 {
    public static void main(String[] args) {
        Account01 soo = new Account01();
        Account01 hee ;
        hee = new Account01() ;

        soo.bankname = "국민 은행" ;
        soo.name = "김철수" ;
        soo.no = 1234 ;
        soo.balance = 1000;

        soo.display();
        String result = soo.showDeposit() ;
        System.out.println(result);

        hee.bankname = "국민 은행" ;
        hee.name = "박영희" ;
        hee.no = 5678 ;
        hee.balance = 2000;

        hee.display();
        result = hee.showDeposit() ;
        System.out.println(result);
    }
}
