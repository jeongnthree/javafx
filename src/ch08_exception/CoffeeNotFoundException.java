package ch08_exception;

public class CoffeeNotFoundException extends Exception{
    private String message ;
    @Override
    public String toString() {
        return "문자열 : " + this.message;
    }
    @Override
    public String getMessage() {
        return "메시지 : " + this.message;
    }
    public CoffeeNotFoundException(String message) {
        this.message = message;
    }
}
