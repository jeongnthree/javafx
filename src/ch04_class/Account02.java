package ch04_class;

public class Account02 {
    static String bankname = "국민 은행" ; // 공유

    String name ;
    int no ;
    int balance ;

    void display() {
        System.out.println( "거래 은행 : " + bankname);
        System.out.println( "예금주 : " + name);
        System.out.println( "계좌 번호 : " + no);
        System.out.println( "예치금 : " + balance);
        System.out.println();
    }
}
