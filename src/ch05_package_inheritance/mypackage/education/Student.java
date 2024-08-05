package ch05_package_inheritance.mypackage.education;

public class Student extends Person{
    private StudentType studentType ; // 학년
    private String grade ; // 학점

    @Override
    public String toString() {
        String imsi = "" ;
        imsi += "학년 : " + this.studentType + "(" + this.studentType.getName() + ")\n" ;
        imsi += "학점 : " + this.grade ;
        return super.toString() + imsi;
    }


    public Student(String name, int age, String address, String phone, MemberType type, StudentType studentType, String grade) {
        super(name, age, address, phone, type);
        this.studentType = studentType;
        this.grade = grade;
    }

    public void learn(){
        String imsi = this.studentType.getName() + " " + super.getName() + "가 공부를 합니다." ;
        System.out.println(imsi);
    }
}