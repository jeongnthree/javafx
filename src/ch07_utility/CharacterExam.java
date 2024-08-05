package ch07_utility_classes;

public class CharacterExam {
    public static void main(String[] args) {
        String str = "Worldcup2002";
        char munja = str.charAt(5) ;
        System.out.println("문자 : " + munja);

        System.out.println("숫자 여부 : " + Character.isDigit(munja));
        System.out.println("문자 여부 : " + Character.isLetter(munja));
        System.out.println("문자 또는 숫자 여부 : " + Character.isLetterOrDigit(munja));
        System.out.println("소문자 여부 : " + Character.isLowerCase(munja));
        System.out.println("공백 여부 : " + Character.isSpaceChar(munja));
        System.out.println("대문자 여부 : " + Character.isUpperCase(munja));
        System.out.println("대문자로 변경 : " + Character.toUpperCase(munja));
		System.out.println("white 캐릭터 여부 : " + Character.isWhitespace(munja));

        /*
            출력 결과
            대문자 : 1개
            소문자 : 7개
            숫자 : 4개
        */
        int upper = 0, lower = 0, digit = 0 ;
        for (int i = 0; i < str.length(); i++) {
            munja = str.charAt(i) ;
            if(Character.isUpperCase(munja)){
                upper += 1 ;
            }else if(Character.isLowerCase(munja)){
                lower += 1 ;
            }else if(Character.isDigit(munja)){
                digit += 1 ;
            }
        }
        
        System.out.println("대문자 : " + upper + "개");
        System.out.println("소문자 : " + lower + "개");
        System.out.println("숫자 : " + digit + "개");
    }
}
