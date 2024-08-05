package ch05_package_inheritance.mypackage.education;

public class Person {
    private String name ; // 이름
    private int age  ; // 나이
    private String address ; // 주소
    private String phone; // 휴대폰 번호
    private MemberType type ; // 직업 유형


        @Override
    public String toString() {
        String imsi = "" ;
        imsi += "이름 : " + this.name + "\n" ;
        imsi += "나이 : " + this.age + "\n" ;
        imsi += "주소 : " + this.address + "\n" ;
        imsi += "휴대폰 번호 : " + this.phone + "\n" ;
        imsi += "직업 : " + this.type + "\n" ;
        imsi += "직업 이름 : " + this.type.getName() + "\n" ;
        return imsi;
    }

    public String getName() {
        return name;
    }

    public Person(String name, int age, String address, String phone, MemberType type) {
        this.name = name ;
        this.age = age ;
        this.address = address ;
        this.phone = phone ;
        this.type = type ;
    }
}
