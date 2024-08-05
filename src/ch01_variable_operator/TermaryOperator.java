package ch01_variable_operator;

public class TermaryOperator {
    public static void main(String[] args) {
        int a = 3, b = 5;
        int result;

        result = a >= b ? a-b : b-a ;

        System.out.println("절대 값 : " + result);
    }
}
