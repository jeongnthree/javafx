package ch05_package_inheritance.mypackage.polymorphism;

public class Employee { // 직원 정보 클래스
    static String ceoname = "강감찬"; // 대표자 이름
    static int count = 0 ; // 직원 수

    // 직원들의 정보를 위한 인스턴스 변수
    private String name ; // 성명
    private String department ; // 부서 이름

    public String getDepartment() {
        return department;
    }

    public Employee(String name, String department) {
        this.name = name ;
        this.department = department ;
        count += 1 ; // 객체 생성시 직원 숫자 1씩 증가시키기
    }

    protected String getInfo() {
        String message = this.name + "(" + this.department + "), ";
        return message ;
    }
}
