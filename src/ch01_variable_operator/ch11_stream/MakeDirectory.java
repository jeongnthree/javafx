package ch01_variable_operator.ch11_stream;

import java.io.File;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class MakeDirectory {
    public static void main(String[] args) {
        String pathname = System.getProperty("user.dir") + "\\src\\data\\" ;
        System.out.println(pathname);

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 1; i <= 12 ; i++) {
            switch (i){
                case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                    map.put(i, 31);
                    break;
                case 4:case 6:case 9:case 11:
                    map.put(i, 30);
                    break;
                case 2:
                    map.put(i, 28);
                    break;
            }
        }

        System.out.println(map);

        DecimalFormat df = new DecimalFormat("00");

        // 일년치 폴더 만들기 : mkdir() 사용하기
        // map을 forEach로 구현해보자
        map.forEach((month, lastday)->{
            File thisMonth = new File(pathname, df.format(month)+"월");
            System.out.println(thisMonth);
            thisMonth.mkdir() ;

            for (int i = 1; i <= lastday ; i++) {
                File today = new File(thisMonth, df.format(i)+"일");
                System.out.println(today);
                today.mkdir() ;
            }
        });
    }
}
