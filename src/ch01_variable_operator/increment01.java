package ch01_variable_operator;

public class increment01 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("x : " + x);

        x += 3 ;//x = x + 3;
        System.out.println("x : " + x);

        x *= 4 ;//x = x + 3;
        System.out.println("x : " + x);

        x %= 5 ;//x = x + 3;
        System.out.println("x : " + x);

        x -= 1 ;//x = x + 3;
        System.out.println("x : " + x);

        x += 7 ;//x = x + 3;
        System.out.println("x : " + x);

        int total = 0 ;



        total += 1;
        total += 2;
        total += 3;
        total += 4;
        total += 5;
        total += 6;
        total += 7;
        total += 8;
        total += 9;
        total += 10;
        System.out.println("총합 : " + total);
    }

}
