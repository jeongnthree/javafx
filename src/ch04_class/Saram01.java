package ch04_class;

// 단계01 : 클래스 선언(정의)
// 구성 요소 : 변수(필드) + 메소드
// 클래스 : 실제 세계에서 발생할 수 있는 속성(필드, 변수)들을 이용하여 추상적으로 만들어 놓은 틀(Template)
// 이미 정의된 여러 개의 데이터 타입들을 묶어서 만드는 사용자 정의 데이터 유형
// 구체적인 물건(Object)을 만들어 내기 위한 탬플릿/설계 도면
// 클래스 이름은 첫 글자를 대문자로 작성하고, 단수 형태로 작성합니다.
public class Saram01 {
    // 멤버 변수
    String nationality;
    String name;
    double height;
    double weight;
    String hobby;
    String blood;


    // 메소드 정의
    // void : no action, empty, 대꾸하지 않음
    //반환타입 메소드이름(매개변수목록){}
    void display(){
        System.out.println("국적 : " + nationality);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("취미 : " + hobby);
        System.out.println("혈액형 : " + blood);


    }


    String showBmiInfo() {
        double newHeight = height / 100.0; // 센티 미터를 미터로 변환
        double rate = weight / (newHeight * newHeight); // 몸무게 나누기 키의제곱
        String bmi = "" ;

        if (rate >= 25.0){
            bmi = "비만";

        }else if (rate >= 23.0){
            bmi = "과체중";

        }else if (rate >= 18.50){
            bmi = "정상";

        }else{
            bmi = "저체중";
        }

        String result = name + "님은 " + bmi + "입니다.";
        return result;
    }


    String showGenderInfo(int juminno) {
        String gender = "";

        if (juminno == 1 || juminno == 3) {
            gender = "남자";
        } else {
            gender = "여자";
        }

        String message = name + "님은 " + gender + "이군요.";
        return message;
    }
}








