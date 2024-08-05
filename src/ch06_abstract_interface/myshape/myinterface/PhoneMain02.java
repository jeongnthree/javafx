package ch06_abstract_interface.myshape.myinterface;

public class PhoneMain02 {
    public static void main(String[] args) {
        String phoneNo = "01011112222" ;
        MiniPhone mini = new MiniPhone(phoneNo) ;
        mini.sendSms();
        mini.receiveSms();
    }
}
