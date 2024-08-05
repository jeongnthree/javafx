package ch05_package_inheritance.mypackage.minishop;

// Enumeration : ~~을 쭈욱 열거합니다.
// 열거형 타입을 기호 상수(symbolic constant)라고 합니다.
public enum Category { // 상품의 유형을 의미하는 열거형 타입
    // 소괄호 내의 항목들은 생성자의 매개 변수로 인식합니다.
    BREAD("빵"),
    BEVERAGE("음료수"),
    CAKE("케익") ;

    private String korname; // 한글 이름

    private Category(String korname) {
        this.korname = korname ;
    }

    public String getKorname() {
        return korname;
    }
}
