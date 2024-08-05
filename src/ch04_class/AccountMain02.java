package ch04_class;

public class AccountMain02 {
    public static void main(String[] args) {
//        Account02.bankname = "우리 은행" ;

        Account02 soo = new Account02() ;

        Account02 hee = new Account02() ;

        soo.name = "김철수" ;
        soo.no = 1234 ;
        soo.balance = 1000 ;

        hee.name = "박영희" ;
        hee.no = 5678 ;
        hee.balance = 2000 ;

        soo.display();
        hee.display();
    }
}