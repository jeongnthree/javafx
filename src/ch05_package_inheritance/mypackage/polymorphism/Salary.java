package ch05_package_inheritance.mypackage.polymorphism;

public class Salary extends Employee{ // 월급 관련 클래스
    // 월급을 미 입력했을 경우 디폴트 값은 3000원입니다.
    private double salary = 3000.0 ; // 월급

    public Salary(String name, double salary, String department) {
        super(name, department);
        this.salary = salary;
    }

    public Salary(String name, String department) {
        super(name, department);
    }

    public void display() {
        // 년봉 변수는 현재 이 메소드에서만 사용할 예정이므로 지역 변수로 정의합니다.
        double annsal = 0.0 ; // 년봉

        // '년봉'은 "영업" 부서와 "판매" 부서일때에만 15배를, 그렇지 않으면 12배로 측정합니다.
        boolean condition = super.getDepartment() == "영업" || super.getDepartment() == "판매";
        if(condition){
            annsal = 15.0 * this.salary ;
        }else{
            annsal = 12.0 * this.salary ;
        }

        String message = super.getInfo() + "급여:" + salary + ", 년봉:" + annsal;
        System.out.println(message);
    }
}
