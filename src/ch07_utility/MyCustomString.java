package ch07_utility_classes;

public class MyCustomString{
    private String sometext ;

    public MyCustomString(String sometext){
        this.sometext = sometext ;
    }

    public String mysubstring(int start, int end){
        // 1 base의 인덱스는 0 base의 인덱스에서 값을 1빼줘야 합니다.
        return this.sometext.substring(start - 1, end )  ;
    }

    public int mycount(String findtext){
        // findtext 변수는 찾고자 하는 문자입니다.
        int counter = 0 ; // 카운터 변수
        for (int i = 0; i < this.sometext.length(); i++){
            if (this.sometext.charAt(i) == findtext.charAt(0)){
                counter++; // 발견되면 카운터 수를 1증가 시킴
            }
        }
        return counter ;
    }

    public String myreverse(int start, int end){
        String imsi = this.mysubstring(start, end) ;
        String temp = "";

        for (int i = 0; i < imsi.length(); i++){
            temp = imsi.charAt(i) + temp ;
        }
        return temp ;
    }
}