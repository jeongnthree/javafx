package ch05_package_inheritance.mypackage.minishop;

public enum Baked { // 빵의 구워진 상태를 의미하는 열거형 타입
    UNBAKED("미구움"), // 구워지지 않은 상태
    LIGHTLY_BAKED("약간 구움"), // 약간 구워진 상태
    MEDIUM_BAKED("적당히 구움"), // 적당히 구워진 상태
    WELL_BAKED("완전히 구움");   // 완전히 구워진 상태

    private String bakedStatus ;

    private Baked(String bakedStatus) {
        this.bakedStatus = bakedStatus;
    }

    public String getBakedStatus() {
        return bakedStatus;
    }
}