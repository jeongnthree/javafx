package ch04_class;

public class OverAdd {
    public void Add(int a, double x) {
        System.out.println("혼합형 : " + (a+x));
    }


    public void Add(int a, int b) {
        System.out.println("정수형 : " + (a+b));
    }

    public void Add(double x, double y) {
        System.out.println("실수형 : " + (x+y));
    }

    public int Add(int a, int b, int c) {
        return a + b + c ;
    }
}
