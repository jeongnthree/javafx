package ch05_package_inheritance.mypackage.polymorphism;

public class SportMain {
    public static void main(String[] args) {
        Football football = new Football("축구", 11, 1, 5); // 이름, 엔트리, 하프타임, 골수
        football.display();

        System.out.println();

        Baseball baseball = new Baseball("야구", 9, 9, 0.412) ; // 이름, 엔트리, 이닝수, 타율
        baseball.display();
    }
}
