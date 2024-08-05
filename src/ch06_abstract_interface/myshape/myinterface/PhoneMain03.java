package ch06_abstract_interface.myshape.myinterface;

public class PhoneMain03 {
    public static void main(String[] args) {
        String phoneNo = "01033334444" ;
        System.out.println("------------------------");
        SmartPhone phone01 = new SmartPhone(phoneNo);
        phone01.receiveCall("잘 있었니?") ;

        System.out.println("------------------------");
        String[] songs = {"광화문 연가", "사랑과 우정 사이"};
        phone01.play(songs);

        System.out.println("------------------------");
        String[] sendlist = {"잘 지내지?", "조만간 한번 볼래"};
        phone01.sendSms(sendlist);

        System.out.println("------------------------");
        SmartPhone[] phonelist = {
                new SmartPhone("01055555555"),
                new SmartPhone("01066666666"),
                new SmartPhone("01077777777")
        };
        for (int i = 0; i < phonelist.length; i++) {
            phonelist[i].sendSms("'문자 배달이요~~'");
        }

        System.out.println("------------------------");
        for (int i = 0; i < phonelist.length; i++) {
            phonelist[i].sendSms(sendlist);
        }

    }
}
