package ch10_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MyBreadList {
    public static void main(String[] args) {
        List<String> breads = new ArrayList<String>();
        String breadString = "바게트,크로와상,스콘,치아바타,나쵸,식빵,호밀빵,베이글";

        String delimiter = ",";
        StringTokenizer breadToken = new StringTokenizer(breadString, delimiter);
        while(breadToken.hasMoreTokens()){
            breads.add(breadToken.nextToken());
        }
        System.out.println(breads);

        int idx = -1 ;
        String findData = "스콘";
        idx = breads.indexOf(findData) ;
        System.out.println("'" + findData + "'의 색인 번호 : " + idx);

        idx = breads.lastIndexOf(findData) ;
        System.out.println("'" + findData + "'의 색인 번호 : " + idx);

        findData = "단팥빵";
        idx = breads.indexOf(findData) ;
        System.out.println("'" + findData + "'의 색인 번호 : " + idx);

        System.out.println("'단팥빵' 항목이 존재하지 않으면, 2번째 요소에 추가해 보세요.");
        if(breads.indexOf(findData) == -1){
            breads.add(2, findData) ;
        }

        findData = "술빵" ;
        breads.set(5, findData) ;

        findData = "앙금빵" ;
        breads.remove(findData) ;

        idx = 3 ;
        String what = breads.get(idx) ;
        System.out.println(idx + "번째 요소 : " + what);

        PrintGet(breads);

        breads.add("앙금빵");

        for(String coffee:breads){
            System.out.print(coffee + "  ");
        }
        System.out.println();

        System.out.println("요소 개수 : " + breads.size());
    }

    private static void PrintGet(List<String> asdf) {
        System.out.println("get 메소드를 이용한 요소 출력");
        String imsi = "" ;
        for (int i = 0; i < asdf.size(); i++) {
            imsi += asdf.get(i) + "\t" ;
        }
        System.out.println(imsi);
    }
}