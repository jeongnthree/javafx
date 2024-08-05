package ch05_package_inheritance.mypackage.education;

public class Teacher extends Person{
    private String[] subjects ; // 강의 과목을 저장하고 있는 배열

    @Override
    public String toString() {
        String imsi = "" ;
        imsi += "강의 과목 리스트\n" ;
        for (int i = 0; i < this.subjects.length; i++) {
            if (i == (this.subjects.length - 1)) { // 마지막 과목에는 엔터키 누르지 않는 효과
                imsi += "과목" + (i + 1) + " : " + subjects[i];
            } else {
                imsi += "과목" + (i + 1) + " : " + subjects[i] + "\n";
            }
        }
            return super.toString() + imsi;
        }

    public Teacher(String name, int age, String address, String phone, MemberType type, String[] subjects) {
        super(name, age, address, phone, type);
        this.subjects = subjects;
    }

    public void teach() {
        String message = "%s 선생님은 %d 과목의 강의가 가능합니다." ;
        System.out.printf(message, super.getName(), this.subjects.length);
    }
}
