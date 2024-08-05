package ch08_exception;

public class LessThan5Test {
    public static void main(String[] args) {
        int x = 3 ;
        LessThan5 error = null ;

        try {
            if(x < 5){
                String message = "5이상의 정수가 필요합니다.";
                error = new LessThan5(message);
                throw error ;
            }else{
                System.out.println("정상적인 프로그램");
            }
        } catch (LessThan5 err) {
            System.out.println("오류 정보");
            System.out.println(err.toString());
            System.out.println(err.getMessage());
            err.printStackTrace();
        }
    }
}
