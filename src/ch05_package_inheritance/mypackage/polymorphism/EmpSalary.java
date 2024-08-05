package ch05_package_inheritance.mypackage.polymorphism;

public class EmpSalary {
    public static void main(String[] args) {
        System.out.println("대표 이사 이름 : " + Employee.ceoname);

        Salary hong = new Salary("홍길동", 10000, "영업");
        hong.display();

        Salary park = new Salary("박영희", 10000, "구매");
        park.display();

        Salary soo = new Salary("김철수",  "광고");
        soo.display();

        System.out.println("총 직원수 : " + Employee.count + "명");
    }
}
