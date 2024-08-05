package ch05_package_inheritance.mypackage.education;

// 학생의 학년 정보를 의미하는 열거형 데이터
public enum StudentType {
    FRESHMAN("1학년"), SOPHOMORE("2학년"), JUNIOR("3학년"), SENIOR("4학년");

    private String name ;

    private StudentType(String name) {
        this.name = name ;
    }

    public String getName() {
        return name;
    }




    }



