package ch02_control_statement;

public class While01 {
    public static void main(String[] args) {
        int total = 0;
        int i = 1;
        while (i < 11) {
            total += i;
            i++;
        }
        System.out.println("종합01 :  total");

        total = 0;
        i = 1;
        while (i < 101) {
            total += i;
            i += 3;

        }
        System.out.println("종합02 ;" + total);

        total = 0;
        i = 97;
        while (i > 1) {
            total += i;
            i -= 5;
        }
        System.out.println("총합3 :" + total);

        total = 0;
        i = 1;
        while (i < 97) {
            total += i * i;
            i += 5;
        }
        System.out.println("총합4 :" + total);

        total = 0;
        i = 1;
        while (i <= 5) {
            total += i * (i + 1);
        }
        System.out.println("총합5 :" + total);

        total = 0;
        i = 1;
        while (i < 100) {
            total += i;
            i += 2;
        }
        System.out.println("총합6 :" + total);


    }
}
