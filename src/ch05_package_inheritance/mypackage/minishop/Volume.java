package ch05_package_inheritance.mypackage.minishop;

public enum Volume { // 음료수 용량을 의미하는 열거형 타입
    SMALL(250, "적은 용량"),
    MEDIUM(350, "중간 용량"),
    LARGE(450, "큰 용량");

    private int milimeters ; // 용량
    private String comment ; // 크기 표현

    Volume(int milimeters, String comment) {
        this.milimeters = milimeters;
        this.comment = comment;
    }

    public int getMilimeters() {
        return milimeters;
    }

    public String getComment() {
        return comment;
    }
}
