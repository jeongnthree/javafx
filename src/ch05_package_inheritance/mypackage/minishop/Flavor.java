package ch05_package_inheritance.mypackage.minishop;

public enum Flavor { // 케이크의 맛을 의미하는 열거형 타입
    VANILLA("바닐라", "맛있죠ㅎㅎ"),
    CHOCOLATE("초콜렛", "달죠"),
    STRAWBERRY("딸기", "좋아요"),
    CARAMEL("카라멜", "마끼야또") ;

    private String korname ; // 한글 이름
    private String comment ; // 맛의 표현

    Flavor(String korname, String comment) {
        this.korname = korname;
        this.comment = comment;
    }

    public String getKorname() {
        return korname;
    }

    public String getComment() {
        return comment;
    }
}
