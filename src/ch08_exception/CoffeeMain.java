package ch08_exception;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class CoffeeMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("커피 이름 입력 : ");
        String name = scan.nextLine();
        System.out.println("이름 : " + name);

        String[] coffees = {"에스프레소", "아메리카노", "카페 라떼", "카푸치노", "마끼야또"} ;
        Arrays.sort(coffees);
        System.out.println(Arrays.toString(coffees));
        int idx = Arrays.binarySearch(coffees, name);
        System.out.println("색인(index) : " + idx);

        boolean isExist = idx > -1 ? true : false ; // Flag 변수

        if(isExist){
            String imsi = "%s은(는) 매장에서 판매하고 있습니다.\n";
            System.out.printf(imsi, name);

            System.out.print("단가를 입력해 주세요 : ");
            int price = scan.nextInt() ;

            String comment = "이름 : %s, 단가 : %s원\n" ;
            System.out.printf(comment, name, new DecimalFormat("###,###").format(price));

        }else{
            String message = name + "은(는) 매장에서 판매하고 있지 않습니다.\n";
            try {
                throw new CoffeeNotFoundException(message);

            } catch (CoffeeNotFoundException e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }

    }
}
