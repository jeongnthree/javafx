package ch06_abstract_interface.myshape.myinterface;

public class SmartPhone extends Pda implements Mp3, MobilePhone, Kakao {
    private String phoneNo ; // 전화 번호
    private String songName ; // 노래 제목
    private int playTime ; // 재생 시간(단위 : 초)

    private final String SENDER = "송신자 ";
    private final String RECEIVER = "수신자 ";

    public String getPhoneNo() {
        return phoneNo;
    }

    public SmartPhone(String phoneNo, String songName, int playTime) {
        this.phoneNo = this.formatPhone(phoneNo) ;
        this.songName = songName ;
        this.playTime = playTime ;
    }

    public SmartPhone(String phoneNo) {
        this.phoneNo = this.formatPhone(phoneNo) ;
    }

    private String formatPhone(String phoneNo) {
        // 숫자로 구성된 휴대폰 번호 사이에 하이폰을 추가해줍니다.
        String newPhoneNo = "" ;
        if(phoneNo.length() == 11){
            newPhoneNo = phoneNo.substring(0, 3) + "-" + phoneNo.substring(3, 7) + "-" + phoneNo.substring(7);

        }else if(phoneNo.length() == 10){
            newPhoneNo = phoneNo.substring(0, 3) + "-" + phoneNo.substring(3, 6) + "-" + phoneNo.substring(6);

        }else{
            newPhoneNo = phoneNo ;
        }
        return newPhoneNo ;
    }


    @Override
    public boolean sendCall() {
        System.out.println(RECEIVER + this.phoneNo + "에게 전화를 겁니다.");
        return false;
    }

    @Override
    public boolean receiveCall() {
        System.out.println(SENDER + this.phoneNo + "로부터 전화를 받았습니다.");
        return false;
    }

    public boolean receiveCall(String munja) {
        System.out.println(SENDER + this.phoneNo + "로부터 " + munja + "라는 문자가 왔습니다.");
        return false ;
    }

    @Override
    public boolean sendSms() {
        System.out.println(RECEIVER + this.phoneNo + "에게 문자를 보냅니다.");
        return false;
    }

    public void sendSms(String message) {
        System.out.println(RECEIVER + this.phoneNo + "에게 " + message + " 문자를 보냅니다.");
    }

    public void sendSms(String[] sendlist) {
        System.out.println("휴대폰 1대에 문자를 여러 번 전송하기");
        System.out.println(RECEIVER + this.phoneNo + "에게 여러 개의 문자를 전송합니다.");
        for (int i = 0; i < sendlist.length; i++) {
            System.out.println((i+1) + "번째 문자 " + sendlist[i] + " 전송");
        }
    }

    @Override
    public boolean receiveSms() {
        System.out.println(SENDER + this.phoneNo + "로부터 문자를 받았습니다.");
        return false;
    }

    public void play(String[] songs) {
        System.out.println("노래 여러 곡 재생하기");
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i+1) + "번째 노래 " + songs[i] + " 재생");
        }
    }

    @Override
    public void play() {
        int minute = this.playTime / 60 ;
        int second = this.playTime % 60 ;
        String strPlayTime = minute + "분 " + second + "초";
        String message = "재생 정보\n";
        message += "재생 시간 : " + strPlayTime + "";
        System.out.println(message);
    }

    @Override
    public void stop() {
        System.out.println(this.songName + "을(를) 재생 중지합니다.");
    }


    @Override
    public void sendPresent(String present) {
        String message = RECEIVER + this.phoneNo + "에게 선물 '%s'를 보냅니다\n";
        System.out.printf(message, present);
    }

    @Override
    public void sendEmoticon(Emoticon emoticon) {
        String message = RECEIVER + this.phoneNo + "에게 이모티콘 '%s(%s)'를 보냅니다\n";
        System.out.printf(message, emoticon.getComment(), emoticon);
    }
}
