package ch05_package_inheritance.mypackage.polymorphism;

public class InheTest02 {
    public static void main(String[] args) {
        Americano02 coffee01 = new Americano02();
        coffee01.display();

        System.out.println();

        Americano02 coffee02 = new Americano02("아메리카노", 5000.0, 300, true);
        coffee02.display();
    }
}
