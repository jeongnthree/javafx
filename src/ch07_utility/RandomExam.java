package ch07_utility_classes;

import java.util.Random ;

public class RandomExam {
    public static void main(String[] args) {
        Random random = new Random();
        int[] jusawee = new int[3] ;
        int repeat = 1000 ; // 최대 시도 회수
        boolean flag = false ; // 주사위 3눈금이 모두 동일시 true가 됩니다.
        int what = 0 ; // 몇 번째 맞췄나요?
        int hitnumber = 0 ; // 3개 모두 동일한 주사위 눈금 번호(1부터 6사이의 값)

        for (int i = 1; i <= repeat ; i++) {
            for (int j = 0; j < jusawee.length; j++) {
                jusawee[j] = random.nextInt(6) + 1 ;
                //System.out.print(jusawee[j] + "\t") ;
            }
            //System.out.println() ;
            if(jusawee[0] == jusawee[1]){
                if(jusawee[0] == jusawee[2]){
                    if (jusawee[0] == 5) {
                        System.out.println(i + "번째 시도에서 모두 숫자 5가 나왔습니다.");
                    }else{
                        hitnumber = jusawee[0] ;
                        what = i ;
                        flag = true ; // 3숫자 모두 동일함
                        break ;
                    }
                }
            }
        }

        if (flag == true) {
            String imsi = "%d번째 시도에서 모두 %d(이)가 출력되었습니다.\n" ;
            System.out.printf(imsi, what, hitnumber) ;
        }else{
            System.out.println(repeat + "번 시도했지만 실패했습니다.");
        }
    }
}
