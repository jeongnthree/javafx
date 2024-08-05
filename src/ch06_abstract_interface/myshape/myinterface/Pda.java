package ch06_abstract_interface.myshape.myinterface;

public class Pda {
    public double calculate(String operator, double x, double y){
        // operator : 연산자 기호 문자열(+ - * /)
        double result = 0.0 ;

        switch (operator){
            case "+" :
                result = x + y ;
                break;
            case "-" :
                result = x - y ;
                break;
            case "*" :
                result = x * y ;
                break;
            case "/" :
                result = y!=0 ? x / y : x ;
                break;
            default:
                System.out.println(operator + " 기호는 잘못된 연산자입니다.");
                result = 0.0 ;
        }

        return result ;
    }
}
