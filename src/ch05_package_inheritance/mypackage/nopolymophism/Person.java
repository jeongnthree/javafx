package ch05_package_inheritance.mypackage.nopolymophism;

public class Person {
    private String name ; // 차주
    private Avante avante ; // has a 관계
    private Sonata sonata;
    private Grandeur grandeur ;

    private double tax = 0.0 ; // 세금

    // 여러 군데에서 반복되는 단어(편집 못하게)
    private final String CURRENCY = "달러" ;
    private final String TRIAL_RIDE = " 시승";


    public void ride(Grandeur grandeur) {
        this.grandeur = grandeur ;

        System.out.println("차주 : " + this.name);
        System.out.println("가격 : " + this.grandeur.getPrice() + CURRENCY);
        System.out.println("차량 : " + this.grandeur.getName() + TRIAL_RIDE);
        System.out.println("연비 : " + this.grandeur.getFuel());

        this.calcTax(this.grandeur.getPrice());
        System.out.println("세금 : " + tax + "원");
        System.out.println("연비 메모 : " + this.grandeur.getRemark());
    }

    public void ride(Sonata sonata) {
        this.sonata = sonata ;

        System.out.println("차주 : " + this.name);
        System.out.println("가격 : " + this.sonata.getPrice() + CURRENCY);
        System.out.println("차량 : " + this.sonata.getName() + TRIAL_RIDE);
        System.out.println("메이커 : " + this.sonata.getMaker());

        this.calcTax(this.sonata.getPrice());
        System.out.println("세금 : " + tax + "원");
    }

    public void ride(Avante avante) {
        this.avante = avante ;

        System.out.println("차주 : " + this.name);
        System.out.println("가격 : " + this.avante.getPrice() + CURRENCY);
        System.out.println("차량 : " + this.avante.getName() + TRIAL_RIDE);
        System.out.println("코멘트 : " + this.avante.getComment());

        this.calcTax(this.avante.getPrice());
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
