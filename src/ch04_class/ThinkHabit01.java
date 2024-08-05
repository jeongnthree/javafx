package ch04_class;// 클래스, 객체, 메소드, this, static, final, getter/setter, 오버로딩, 생성자, 연산자, 제어

public class ThinkHabit01 {
    static String institute ;
    int name ;
    int age ;
    private int diligence;
    private int makeinfomine  ;
    private int mindcontrl;
    private int attitude ;

    public ThinkHabit01(int diligence, int makeinfomine, int mindcontrl, int attitude) {
        this.diligence = diligence;
        this.makeinfomine = makeinfomine;
        this.mindcontrl = mindcontrl;
        this.attitude = attitude;
    }

    public void display(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성실성 : " + this.diligence);
        System.out.println("정보자기화 : " + this.makeinfomine);
        System.out.println("감정조절 : " + this.mindcontrl);
        System.out.println("태도 : " + this.attitude);
    }

    public String showGradeInfo() {
        int jumsu = 0;
        String grade = "";

        if (this.diligence >= 90) {
            grade = "성실성:상위, ";

        } else if (this.diligence >= 80) {
            grade = "성실성:중상위, ";

        } else if (this.diligence >= 70) {
            grade = "성실성:평범, ";

        } else if (this.diligence >= 60) {
            grade = "성실성:관찰, ";
        } else {
            grade = "성실성:개선, ";
        }

        if (this.makeinfomine >= 90) {
            grade += "정보자기화:상위";

        } else if (this.makeinfomine >= 80) {
            grade += "정보자기화:중상위";

        } else if (this.makeinfomine >= 70) {
            grade += "정보자기화:평범";

        } else if (this.makeinfomine >= 60) {
            grade += "정보자기화:관찰";
        } else {
            grade += "정보자기화:개선";
        }


        String result = name + "님의 " + grade + "입니다.";
        return result;
    }
}

//    String name ;
//    int age ;
//    private int diligence;
//    private int makeinfomine  ;
//    private int mindcontrl;
//    private int attitude ;
//
//
//
//
//    int selfinfo  ;
//
//    public ThinkHabit01(int diligence, int makeinfomine, int mindcontrl, int attitude) {
//        this.diligence = diligence;
//        this.makeinfomine = makeinfomine;
//        this.mindcontrl = mindcontrl;
//        this.attitude = attitude;
//    }
//
//    public void  display() {
//
//        System.out.println("이름 : " + name);
//        System.out.println("나이 : " + age);
//        System.out.println("성실성 : " + this.diligence);
//        System.out.println("정보자기화 : " + this.makeinfomine);
//        System.out.println("감정조절 : " + this.mindcontrl);
//        System.out.println("태도" + this.attitude);
//
//
////        String showGradeInfo () {
////            int jumsu = ;
////            String grade = "";
////
////            if (jumsu >= 90) {
////                grade = "상위";
////
////            } else if (jumsu >= 80) {
////                grade = "중상위";
////
////            } else if (jumsu >= 70) {
////                grade = "평범";
////
////            } else if (jumsu >= 60) {
////                grade = "관찰";
////            } else {
////                grade = "개선";
////            }
////
////
////            String result = name + "님의 등급은" + bmi + "입니다.";
////            return result;
////        }
//
////        String showPainHabitInfo(){
////
////        }
//
//
//    }
//}
