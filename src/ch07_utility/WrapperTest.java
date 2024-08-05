package ch07_utility_classes;

public class WrapperTest {
    public static void main(String[] args) {
        System.out.println("int 타입이 취할 수 있는 최대값 : " + Integer.MAX_VALUE);
        System.out.println("int 타입의 메모리 크기 : " + (Integer.SIZE/8) + "바이트");

        System.out.println("long 타입이 취할 수 있는 최대값 : " + Long.MAX_VALUE);
        System.out.println("double 타입이 취할 수 있는 최대값 : " + Double.MAX_VALUE);

        int xx = 2147483647  ;
        System.out.println(++xx) ;

        // 정수 aa에 대하여 숫자를 뒤집고, bb를 합쳐 보기
        // 결과 : 43215678
        int aa = 1234, bb = 5678, cc = 10 ;
        System.out.println("이진수 : " + Integer.toBinaryString(cc));

        String imsi = "" ; // 임시 변수
        // String strA = new String("" + aa) ;
        String strA = new String(String.valueOf(aa)) ;
        int len = strA.length() ;
        for (int i = len - 1 ; i >= 0  ; i--) {
            imsi += strA.charAt(i) ;
        }
        System.out.println("aa 뒤집기 결과 : " + imsi);

        String strB = String.valueOf(bb) ;
        String temp = imsi + strB ;
        System.out.println("최종 합친 결과 : " + temp);

        int su = Integer.parseInt(temp) - 15000 ;
        System.out.println("숫자로 변경 후 15000 빼기 : " + su);

         // 상품 = 코드명 + 단가 + 일련번호
        String item = "Abc123가가";

        System.out.println("상품의 단가에 100원을 더해 주세요.");
        System.out.println("코드는 모두 대문자로 변경해 주세요.");

        String code = item.substring(0, 3);
        code = code.toUpperCase();
        System.out.println("코드 : " + code);

        String _price = item.substring(3, 6);
        System.out.println("임시 가격 : " + _price);

        int price = Integer.valueOf(_price) + 100 ;
        System.out.println("100원 추가된 금액 : " + price);

        String sequence = item.substring(6);
        System.out.println("일련 번호 : " + sequence);

        String result = code + String.valueOf(price) + sequence ;
        System.out.println("최종 결과 : " + result);
    }
}
