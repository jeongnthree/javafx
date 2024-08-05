package ch10_collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomTeamAssign {
    public static void main(String[] args) {
        // 다음 명단(24명)을 이용하여 6명씩 4개조로 만들어 보세요.
        String names = "김준혁,김지웅,김유정,김송민,민혜진,박영민,박진주,백상우,변종민,서경환,서영우,손창희,양경배,엄태현,위진희,유하얀,윤진솔,이홍준,이승혁,임한울,정기은,정현우,정재혁,최소연" ;

        String[] array = names.split(",");
        System.out.println(array.length);

        List<String> nameList =  Arrays.asList(array);
        Collections.shuffle(nameList);
        System.out.println(nameList);

        final int MemberSize = 6  ;

        for (int i = 0; i < nameList.size(); i += MemberSize) {
            int begin = i ;
            int end = i + MemberSize ;
            if(end > nameList.size()){
                end = nameList.size() ;
            }
            List<String> subList = nameList.subList(begin, end);
            int jo = i / MemberSize + 1 ;
            System.out.println(jo + "조 : " + subList.toString());
        }
    }
}
