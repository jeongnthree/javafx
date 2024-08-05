package ch08_exception;

public class MyException03 {
    public static void main(String[] args) {

        try{
            String xx = "aa" ;
            first( xx );
        }catch (ArithmeticException ex){
            System.out.println("0으로 나누지 마세요.");

        }catch (NumberFormatException ex){
            System.out.println("숫자 형변환 예외 발생.");
            ex.printStackTrace();
        }catch (Exception ex){
            System.out.println("기타 나머지 예외 발생.");
        }

    }
    private static void first(String xx) throws ArithmeticException,NumberFormatException{
        int x = Integer.parseInt(xx);
        second();
    }
    private static void second() throws ArithmeticException {
        third();
    }
    private static void third() throws ArithmeticException {
        int i=1, j=0 ;
        System.out.println( i / j );
    }
}