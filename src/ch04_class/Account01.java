package ch04_class;

public class Account01 {
    String bankname ; // 은행 이름 
    String name ; // 이름
    int no ; // 계좌 번호
    int balance ; //// 예치금, 잔액

    //날씨가 넘 더워요

    //반환타입 메소드이름(매개변수목록){}
    String showDeposit(){
        String message = "" ;

        if(balance >= 1500){
            message = name + "님은 예치금(" + balance + ")이 많네요" ;
        }else{
            message = name + "님은 예치금(" + balance + ")이 적네요" ;
        }

        return message ;
    }
    
    void display(){
        System.out.println("은행명 : " + bankname);
        System.out.println("예금주 : " + name);
        System.out.println("계좌 번호 : " + no);
        System.out.println("예치금 : " + balance);
    }
}
