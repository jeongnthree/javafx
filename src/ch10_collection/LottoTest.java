package ch10_collection;

import java.util.*;

public class LottoTest {
    public static void main(String[] args) {
        Set<Integer> lotto = new HashSet<Integer>() ;
        Random rand = new Random() ;
        int secondno = 0 ; // 이등 번호

        while(lotto.size() < 7){
            int su = rand.nextInt(45) + 1 ;
            if(lotto.size() == 6){
                // 1등 번호는 이미 모두 추출된 상태임
                // 2등 번호는 임시로 secondno에 할당해 두도록 합니다.
                secondno = su ;
            }
            lotto.add(su);
        }
        // 2등 번호를 포함한 7개이므로, remove 메소드를 사용하여 2등 번호를 제거합니다.
        lotto.remove(secondno) ;

        Object[] newlotto = lotto.toArray() ;
        Arrays.sort(newlotto);

        System.out.print("금주의 로또 번호 : ");
        for(Object item:newlotto){
            System.out.print(item + "\t");
        }
        System.out.println() ;
        System.out.println("2등 번호 : " + secondno);

        List<Integer> lottolist = new ArrayList<Integer>(lotto);
        Collections.sort(lottolist);
        System.out.println(lottolist) ;

    }
}