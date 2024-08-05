package ch01_variable_operator;

public class PusMinus01 {
    public static void main(String[] args) {
        int a = 10, b = 20, c ;

        c = ++a + b++ ;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        c = a++ + --b ;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        a = 15;
        b = 12;
        c = --a + --b ;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
    }
}
