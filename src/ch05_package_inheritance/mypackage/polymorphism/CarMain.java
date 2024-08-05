package ch05_package_inheritance.mypackage.polymorphism;

public class CarMain {
    public static void main(String[] args) {
        Person soo = new Person("김철수");

        Car car = null ; // 지역 변수

        car = new Avante("아반떼", 100, "가장 많은 판매");
        soo.ride(car);

        System.out.println("==================================");

        Person hee = new Person("박영희");
        car = new Sonata("소나타", 200, "Hyundi");
        hee.ride(car);

        System.out.println("==================================");

        Person minsik = new Person("최민식");
        car = new Grandeur("그랜져", 300, 24.1);
        minsik.ride(car);

        System.out.println("==================================");
    }
}
