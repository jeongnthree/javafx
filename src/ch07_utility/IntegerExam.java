package ch07_utility_classes;

import java.util.Scanner;

public class IntegerExam {
    public static void main(String[] args) {
		System.out.println("최소 값 : " + Integer.MIN_VALUE);
        System.out.println("최대 값 : " + Integer.MAX_VALUE);
		System.out.println("자료형 공간 : " + Integer.BYTES + "바이트");

        int i = 10 ;
        String stri = Integer.toString(i) ;
        System.out.println("문자열 : " + stri); // 문자열

        String binaryValue = Integer.toBinaryString(i) ;
        String octalValue = Integer.toOctalString(i) ;
        String hexValue = Integer.toHexString(i) ;

        System.out.println("2진수 : " + binaryValue);
        System.out.println("8진수 : " + octalValue);
        System.out.println("16진수 : " + hexValue);

        // parsing(파싱) : 어떤 데이터가 적합한 타입의  데이터인지를 검증하는 절차
        // parseInt(문자열, [진법]) 메소드 : 데이터를 정수형으로 변환해주는 메소드
        // "진법"의 기본 값은 10입니다.
        // parseInt(str, 2) 메소드 : 2진법으로 되어 있는 문자열 str을 10진수로 변경해 주세요.

        String _age = "20" ;
        int age = Integer.parseInt(_age) ;
        System.out.println("나이 : " + age);

        int binaryToDecimal = Integer.parseInt(binaryValue, 2);
        int octalToDecimal = Integer.parseInt(octalValue, 8);
        int hexToDecimal = Integer.parseInt(hexValue, 16);

        System.out.println("2진수를 10진 정수형으로 변환 : " + binaryToDecimal);
        System.out.println("8진수를 10진 정수형으로 변환 : " + octalToDecimal);
        System.out.println("16진수를 10진 정수형으로 변환 : " + hexToDecimal);
		
		String str = "100" ; // 2진수 '100'은 10진수로 '4'입니다.
        int result = Integer.parseInt(str, 2) ;
        System.out.println("2진수 '100'은 10진수로 '4'입니다. : " + result);

        Scanner scan = new Scanner(System.in) ;
        System.out.print("정수 입력 : ");
        String su01 = scan.next() ; // 입력 받는 숫자들은 사실 문자열입니다.
        int su02 = Integer.parseInt(su01) + 300 ; // 정수형으로 파싱되고, +300연산이 이루어집니다.
        System.out.println("300 더한 값 : " + su02); // 숫자 su02이 문자열로 형변환 됩니다.

        System.out.println("부호 메소드 사용");
        System.out.println("Integer.signum(50) : " + Integer.signum(50));
        System.out.println("Integer.signum(0) : " + Integer.signum(0));
        System.out.println("Integer.signum(-15) : " + Integer.signum(-15));

        // 대부분의 wrapper 클래스에는 valueOf()라는 메소드가 있습니다.
        // 이 메소드는 데이터를 해당 클래스 타입으로 변경해주는 메소드입니다.
        // Integer.valueOf("1234")는 문자열 "1234"를 Integer 1234로 변경해 줍니다.
		// valueOf() 메소드는 wrapper 클래스들이 모두 소유하고 있습니다.
        int su03 = Integer.valueOf(su01) - 100 ;
        System.out.println("100 뺄셈한 값 : " + su03);

        su02 = 20 ;
        su03 = 30 ;
        System.out.println("큰 수 : " + Integer.max(su02, su03));
        System.out.println("작은 수 : " + Integer.min(su02, su03));
        System.out.println("두 수 합치기 : " + Integer.sum(su02, su03));

        scan.close();
    }
}




