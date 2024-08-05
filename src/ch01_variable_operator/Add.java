package ch01_variable_operator;

public class Add {
    public static void main(String[] args) {
        //
        // 정수형 데이터를 위하여 x를 준비해라
        int x ;
        int y ;
        int z ;

        // 정수 3을 x에 대입하시오.
        x = 3 ;
        y = 5 ;

        // + 기호의 2가지 용도
        // 1) 덧셈, 2) 문자열 결합
        z = x + y ;


        System.out.println("x는 " + x);
        System.out.println("y는 " + y);
        System.out.println("z는 " + z);

        x = 4 ; //overwrite
        y = 9 ;
        z = x * y ;

        System.out.println("x는 " + x);
        System.out.println("y는 " + y);
        System.out.println("z는 " + z);

        String message ;
        message = x + " 곱하기 " + y + "는(은)" + z + "입니다." ;
        System.out.println(message);

        String hello = "안녕하세요.";
        System.out.println(hello);

        int age = 30 ;
        System.out.println("나이 : " + age);


    }
}
