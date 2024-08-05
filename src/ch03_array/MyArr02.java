package ch03_array;

public class MyArr02 {
    public static void main(String[] args) {
        int [] a = new int[3];

        for (int i = 0; i <  a.length; i++) {
            a[i]=10*i + 10;

        }

        for (int i = 0; i < a.length; i++) {
            String temp = "a[%d] = %2d\n";
            System.out.printf(temp,i,a[i]);

        }

        //타입[ ] 배열 이름 = new 타입

        int[] b = new int[(98-3)/5 + 1];
        for (int i = 0; i < b.length; i++) {
            b[i] = 5*i +3;
            String temp = "b[%d] = %2d\n ";
            System.out.printf(temp,i,b[i]);

        }

        int[] c = new int[(92-2)/10 + 1];
        for (int i = 0; i < c.length; i++) {
            c[i] = 92-10*i;

            String temp = "b[%d] = %2d\n";
            System.out.printf(temp, i, c[i] );

        }

        int[] d = new int[(97-7)/3 + 1];
        for (int i = 0; i < d.length; i++) {
            d[i] = 3*i + 7 ;

            String temp = "d[%d] = %2d\n";
            System.out.printf(temp, i, d[i] );
        }
    }
}
