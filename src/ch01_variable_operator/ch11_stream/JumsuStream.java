package ch01_variable_operator.ch11_stream;

import java.io.*;
import java.text.DecimalFormat;

public class JumsuStream {
    public static void main(String[] args) {
        String pathname = System.getProperty("user.dir") + "\\src\\data\\" ;
        String source = pathname + "jumsu.txt"; // 읽어 들일 파일
        String target = pathname + "result.txt"; // 생성될 파일

        BufferedReader br = null ;
        BufferedWriter bw = null ;

        FileReader fr = null ;

        try{
            fr = new FileReader(new File(source));
            br = new BufferedReader(fr);
            bw = new BufferedWriter(new FileWriter(new File(target))) ;

            // 줄단위로 읽어 와서 가공 처리한다음 파일에 쓰기
            String oneline = "" ;
            while((oneline = br.readLine()) != null){
                String result = makeStr(oneline) ;
                //System.out.println(result);
                bw.write(result);
                bw.newLine();
            }

            System.out.println("파일 작업 완료");

        }catch (FileNotFoundException e){
            System.out.println("파일이 없습니다.");
            e.printStackTrace();

        }catch (IOException e){
            System.out.println("입출력 예외 발생");
            e.printStackTrace();


        }catch (Exception e){
            System.out.println("기타 예외 발생");
            e.printStackTrace();

        }finally {
            try{
                if(br != null){br.close();}
                if(fr != null){fr.close();}
                if(bw != null){bw.close();}
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private static String makeStr(String oneline) {
//        String delimiter = "," ;
//        StringTokenizer st = new StringTokenizer(oneline, delimiter);
//
//        String name = st.nextToken() ;
//        double kor = Double.parseDouble(st.nextToken()) ;
//        double eng = Double.parseDouble(st.nextToken()) ;
//        double math = Double.parseDouble(st.nextToken()) ;
//        String gender = st.nextToken().equalsIgnoreCase("M") ? "남자" : "여자" ;

        String[] arr = oneline.split(",") ;

        String name = arr[0] ;
        double kor = Double.parseDouble(arr[1]) ;
        double eng = Double.parseDouble(arr[2]) ;
        double math = Double.parseDouble(arr[3]) ;
        String gender = arr[4].equalsIgnoreCase("M") ? "남자" : "여자" ;

        double _total = kor + eng + math ;
        double _average = _total / 3.0 ;

        String pattern = "###.0" ;
        DecimalFormat df = new DecimalFormat(pattern) ;
        String total = df.format(_total) ;
        String average = df.format(_average) ;

        String result = name + "/" + gender + "/" + total + "/" + average ;
        return result ;
    }
}
