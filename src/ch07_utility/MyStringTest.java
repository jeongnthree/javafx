package ch07_utility_classes;

public class MyStringTest {
    public static void main(String[] args) {
        System.out.println("indexOf 메소드는 해당 문자열이 발견된 위치를 정수값으로 반환해 줍니다.");
        String str = "hong@naver.com" ;
        int alt = str.indexOf("@") ;
        System.out.println("@위치 : " + alt);

        System.out.println("substring는 특정 위치의 문자열을 추출해 줍니다.");
        String id = str.substring(0, alt);
        System.out.println("아이디 : " + id);

        String email = str.substring(alt + 1);
        System.out.println("이메일 : " + email);

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(i));
        }

        // 문자열 sometext를 이용하여 각각 아이디와 이메일을 추출해 보세요.
        String sometext = "abc@naver.com;def@daum.net" ;

        String[] maillist = sometext.split(";") ;
        for (int i = 0; i < maillist.length; i++) {
            alt = maillist[i].indexOf("@") ;
            id = maillist[i].substring(0, alt) ;
            email = maillist[i].substring(alt+1) ;
            String message = "%d번째 회원의 아이디 : %s, 이메일 : %s\n" ;
            System.out.printf(message, (i+1), id, email);
        }
    }
}
