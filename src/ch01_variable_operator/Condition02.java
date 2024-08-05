package ch01_variable_operator;

public class Condition02 {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        int result = (a >= b) ? 5 : (a + 2);

        System.out.println("result : " + result);

        a = 7;
        b = 7;
        result = (a >= b) ? 5 : (a + 2);
        System.out.println("result : " + result);

        a = 2;
        b = 5;
        result = (a >= b) ? 5 : (a + 2);
        System.out.println("result : " + result);

        int x = 5 ;
        result = x%2 == 0 ? x + 3 : x*x;
        System.out.println("result" + result);

        int y = 12 ;
        String str = y%x == 0 ? "yes" : "no";
        System.out.println(str);
    }
}
