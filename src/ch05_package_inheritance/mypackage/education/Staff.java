package ch05_package_inheritance.mypackage.education;

public class Staff extends Person {
    private String department; // 부서 이름

    public Staff(String name, int age, String address, String phone, MemberType type, String department) {
        super(name, age, address, phone, type);
        this.department = department;
    }

    @Override
    public String toString() {
        String imsi = "" ;
        imsi += "부서 이름 : " + this.department  ;
        return super.toString() + imsi;
    }

    public void work() {
        String imsi = "직원 " + super.getName() + "이(가) " + this.department + " 부서에서 근무합니다.";
        System.out.println(imsi);
    }
}
