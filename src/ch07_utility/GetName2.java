package ch07_utility_classes;

public class GetName2 {
    public static void main(String[] args) {
        // target 문자열에 what 문자열이 몇번 들어 있나요?
        final String what = "강호동" ;
        String target = "강호동강호동유재석김철수강호동" ;
        System.out.println("문자열 원본 : " + target );

        int cnt = 0 ; // 발견된 회수(카운터 변수)
        int idx = -1; // what 변수가 발견된 위치의 인덱스 숫자
        int len = what.length() ; // 찾고자 하는 문자열 what의 길이

        while(true){
            idx = target.indexOf(what) ;
            if (idx == -1) {
                String imsi = "\'%s\'는(은) 더 이상 존재하지 않습니다.\n" ;
                System.out.printf(imsi, what);
                break ;
            }else{
                target = target.substring(idx + len) ;
                System.out.println("새로이 추출된 문자열 : " + target );
                cnt++ ;
            }
        }

        String message = "문자열 \'%s\'는(은) %d번 발견되었습니다.\n" ;
        System.out.printf(message, what, cnt);
    }
}
