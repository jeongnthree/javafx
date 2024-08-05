package ch05_package_inheritance.mypackage.education;

// 직업 유형을 의미하는 열거형 데이터
public enum MemberType {
    STUDENT("학생"), TEACHER("선생님"), STAFF("직원");

    private String name ;

    private MemberType(String name) {
        this.name = name ;
    }

    public String getName() {
        return name;
    }
}
