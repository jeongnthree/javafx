package ch04_class;

public class Mathematics {
    public static String first = "첫번째"; // static(클래스) 변수
    public String second = "두번째"; // instance 변수

    // 2개의 정수 중 큰수를 반환해주는 static 메소드입니다.
    // 누구든지 클래스 이름으로 접근이 가능합니다.
    public static int max(int x, int y) {
        return x >= y ? x : y ;
    }

    // 2개의 정수 중 작은 수를 반환해주는 instance 메소드입니다.
    // 반드시, 객체를 통하여 접근해야 합니다.
    public int min(int x, int y) {
        return x <= y ? x : y ;
    }
}




