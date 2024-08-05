package ch08_exception;

public class Between1And100 extends Throwable {
    private String message ; // 예외 관련 메시지 저장용

    public Between1And100(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "문자열 : " + this.message;
    }
    @Override
    public String getMessage() {
        return "메시지 : " + this.message;
    }
}
