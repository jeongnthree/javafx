package ch01_variable_operator.ch11_stream;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MakeFileFolder {
    public static void main(String[] args) {
        String pathname = System.getProperty("user.dir") + "\\src\\data\\" ;
        System.out.println(pathname);

        // 품목별 폴더와 파일 만들기
        Map<String, List<String>> map = new HashMap<String, List<String>>();

        map.put("커피", Arrays.asList("아메리카노", "카푸치노"));
        map.put("빵", Arrays.asList("크로아상", "소금빵"));

        // map을 forEach로 구현해보자
        //mkdir(), createNewFile() 사용하기
        System.out.println(map);

        map.forEach((category, fileList)->{
            File myfolder = new File(pathname, category);
            System.out.println(myfolder);
            myfolder.mkdir() ;

            fileList.forEach((file)->{
                File somefile = new File(myfolder, file+".txt");
                System.out.println(somefile);
                try {
                    somefile.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        });
    }
}