package ch08_exception;

public class OddNumberException extends Exception{
    private int cnt ; // 시도 횟수
    private int su ; // 예외가 발생한 숫자

    public OddNumberException(int cnt, int su, String message) {
        super("숫자 " + su + "이(가) " + message);
        System.out.println(message);
        this.cnt = cnt ;
        this.su = su ;
    }

    @Override
    public String toString() {
        String imsi = cnt + "번째 시도에서 숫자 " + su + "이(가) 생성되어서 예외 처리합니다." ;
        return imsi;
    }
}
