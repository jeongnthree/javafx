package ch08_exception;

public class LessThan5 extends Exception{
    private String message ; // 오류 메시지
//
    public LessThan5(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "메시지 출력 : " + this.message;
    }

    @Override
    public String toString() {
        return "오버라이딩 : " + this.message;
    }
}
