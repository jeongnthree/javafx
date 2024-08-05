package ch05_package_inheritance.mypackage.polymorphism;

public class Person {
    private String name ; // 차주
    private Car car ; // 어떤 차

    private double tax = 0.0 ; // 세금

    // 여러 군데에서 반복되는 단어(편집 못하게)
    private final String CURRENCY = "달러" ;
    private final String TRIAL_RIDE = " 시승";

    public void ride(Car car) {
        this.car = car ;

        System.out.println("차주 : " + this.name);
        System.out.println("가격 : " + this.car.getPrice() + CURRENCY);
        System.out.println("차량 : " + this.car.getName() + TRIAL_RIDE);

        if(car instanceof Avante){
            Avante myavante = (Avante)car;
            System.out.println("코멘트 : " + myavante.getComment());

        }else if(car instanceof Sonata){
            Sonata mysonata = (Sonata)car;
            System.out.println("메이커 : " + mysonata.getMaker());

        }else if(car instanceof Grandeur){
            Grandeur mygrandeur = (Grandeur)car;
            System.out.println("연비 : " + mygrandeur.getFuel());
            System.out.println("연비 메모 : " + mygrandeur.getRemark());
        }

        this.calcTax(this.car.getPrice());
        System.out.println("세금 : " + tax + "원");

    }

    private void calcTax(int price) {
        this.tax = price >= 150.0 ? 0.10 * price : 0.05 * price ;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }
}
