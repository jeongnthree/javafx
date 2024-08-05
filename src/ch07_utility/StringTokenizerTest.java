package ch07_utility_classes;

import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        String str = "소녀시대 빅뱅 원더걸스 exid 걸스데이" ;

        System.out.println("기본 값으로 해당 문자열을 공백으로 나누어 토큰을 생성합니다.");
        StringTokenizer st1 = new StringTokenizer(str) ;
        System.out.println("토큰 개수 : " + st1.countTokens());

        while(st1.hasMoreTokens()){
            String item = st1.nextToken() ;
            System.out.println(item);
        }
        System.out.println() ;
        str = "소녀시대/빅뱅/원더걸스/exid/걸스데이" ;

        // 구분자(delimiter)를 지정할 수 있습니다.
        StringTokenizer st2 = new StringTokenizer(str, "/") ;
//        while(st2.hasMoreTokens()){
//            String item = st2.nextToken() ;
//            System.out.println(item);
//        }

        System.out.println("for 구문 사용하기") ;
        int su = st2.countTokens() ;

        for (int i = 0; i < su; i++) {
            String item = st2.nextToken() ;
            System.out.println(item);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        str = "소녀시대/빅뱅/원더걸스/exid/걸스데이" ;

        // 세번째 매개 변수가 true이면 delimiter를 보존합니다.
        StringTokenizer st3 = new StringTokenizer(str, "/", true) ;
        while(st3.hasMoreTokens()){
            String item = st3.nextToken() ;
            System.out.println(item);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        str = "id=hong&password=1234&address=철산동" ;
        StringTokenizer st4 = new StringTokenizer(str, "&") ;
        while (st4.hasMoreTokens()){
            String token = st4.nextToken() ;
            StringTokenizer st5 = new StringTokenizer(token, "=") ;
            while(st5.hasMoreTokens()){
                System.out.print(st5.nextToken() + "\t");
            }
            System.out.println();
        }



        System.out.println("StringTokenizer 클래스와 String 클래스의 조합");
        str = "id=hong&password=1234&address=철산동" ;
        StringTokenizer st6 = new StringTokenizer(str, "&") ;
        while (st6.hasMoreTokens()){
            String token = st6.nextToken() ;
            int idx = token.indexOf("=") ;
            String left = token.substring(0, idx) ;
            String right = token.substring(idx+1) ;
            System.out.println(left + " : " + right);
        }
    }
}
