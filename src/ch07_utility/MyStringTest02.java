package ch07_utility_classes;

public class MyStringTest02 {
    public static void main(String[] args) {
        String sometext = "abcdefghaa" ;

        MyCustomString mystr = new MyCustomString(sometext);

        //사람 기준 : 3번째 부터 5번째 까지 이므로 문자열
        String result = mystr.mysubstring(3, 5) ;
        System.out.println("mysubstring(3, 5) : " + result);

        //문자열 a는 몇개?
        int count  = mystr.mycount("a") ;
        System.out.println("mycount(\"a\") : " + count);

        //사람 기준 : 3번째 부터 5번째 까지의 문자열을 뒤집기
        String myrev = mystr.myreverse(3, 5) ;
        System.out.println("myreverse(3, 5) : " + myrev);
    }
}
