package ch08_exception;

public class MinJumsuException extends Exception{
    private String subject ; // 과목
    private String message ; // 메시지

    public MinJumsuException(String subject, String message ) {
        this.subject = subject ;
        this.message = message ;
    }
    @Override
    public String getMessage() {
        return "메시지 : " + this.subject + " 점수 " + this.message ;
    }
    @Override
    public String toString() {
        return "예외 문자열 : " + this.message ;
    }
}