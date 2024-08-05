package ch02_control_statement;

public class If05 {
    public static void main(String[] args) {
        String str = "korea";

        char ch = str.charAt(4);
        System.out.println(ch);

        if ('A' <= ch && ch <= 'Z') {
            System.out.println("대문자입니다.");
        } else if ('a' <= ch && ch <= 'z') {
            System.out.println("소문자입니다.");
        } else if ('0' <= ch && ch <= '9') {
            System.out.println("숫자입니다.");
        } else {
            System.out.println("기타 문자입니다.");
        }
    }
}
