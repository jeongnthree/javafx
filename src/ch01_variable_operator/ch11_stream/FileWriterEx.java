package ch01_variable_operator.ch11_stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {
        // user.dir : 현재 진행중인 작업 경로를 의미하는 속성(Property)
        // 폴더 구분시 윈도우는 역슬래시 1개인데, 특수 문자라서 역슬래시 2개로 표현합니다.
        // 리눅스 계열은 슬래시 1개로 표현합니다.
        String pathname = System.getProperty("user.dir") + "\\src\\data\\";
        System.out.println(pathname);

        String filename = pathname + "jumsu.txt";
        System.out.println(filename);

        // File 클래스 : 파일이나 폴더 정보를 객체로 만들어 주는 클래스
        File target = new File(filename);

        FileWriter fw = null ;
        BufferedWriter bw = null;

        try{
            fw = new FileWriter(target);

            // bw 객체에는 파일 기록과 관련된 메소드들이 많이 구비 되어 있습니다.
            bw = new BufferedWriter(fw);

            bw.write("제시카,60.0,70.0,80.0,F");
            bw.newLine();
            bw.write("홍길동,50.0,70.0,100.0,M");
            bw.newLine();
            bw.write("유재석,60.0,70.0,80.0,M");
            bw.newLine();
            bw.write("티파니,40.0,80.0,50.0,F");
            bw.newLine();

            System.out.println(filename + " 생성됨");
        }catch (IOException ex){
            System.out.println("입출력 예외 발생");
            ex.printStackTrace();
        }finally {
            try {
                // 생성과 소멸은 반대로 ....
                if(bw != null){bw.close();}
                if(fw != null){fw.close();}
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
