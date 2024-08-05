package ch08_exception;

public class ExcepTest03 {
    public static void main(String[] args) {
        String str = "hello korea";

        try{
            String message = getMessage();
            int len = message.length();
            System.out.println("글자 길이 : " + len);

            int idx = str.indexOf("asdf");
            System.out.println("색인 위치 : " + idx);

            String temp = str.substring(0, idx) ;
            System.out.println(temp);

        }catch (StringIndexOutOfBoundsException ex){
            System.out.println("문자열 추출 색인 예외 발생");

        }catch (NullPointerException ex){ // NPE
            System.out.println("널 포인터 예외 발생");
        }catch (Exception ex){
            System.out.println("기타 나머지 예외 발생");
        }finally {
            System.out.println("무조건 실행 되는 영역");
        }
    }

    private static String getMessage() {
        String message = "hello~~world";
        return message ;
    }
}
