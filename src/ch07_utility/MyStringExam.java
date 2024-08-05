package ch07_utility_classes;

public class MyStringExam {
    public static void main(String[] args) {
        String str = "lastgodfather";
        System.out.println("현재 문자열 : " + str );

        int at = str.indexOf("t") ;
        int dt = str.lastIndexOf("t") ;
		System.out.println("앞쪽 t 위치 : " + at);
		System.out.println("뒤쪽 t 위치 : " + dt);

        String temp = str.substring(at + 1, dt) ;
        System.out.println("추출된 문자열 : " + temp);

        String imsi = "" ;
        for (int i = temp.length()-1 ; i >= 0 ; i--) {
            imsi += temp.charAt(i) ;
        }
        System.out.println("뒤집힌 문자열 : " + imsi);

        StringBuffer sb = new StringBuffer(temp) ;

        System.out.println("StringBuffer를 사용한 결과 : " + sb.reverse() );
		
		System.out.println("문자열 치환하기");
        System.out.println(str.replace('a', 'x'));		
		System.out.println(str.replaceFirst("a", "x"));
		
        String data = "  hello~~world  " ; // 앞뒤 2칸씩 띄우기
        System.out.println("[" + data + "]");
        System.out.println("[" + data.strip() + "]");
        System.out.println("[" + data.stripLeading() + "]");
        System.out.println("[" + data.stripTrailing() + "]");		
    }
}