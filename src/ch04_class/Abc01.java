package ch04_class;
// 나는 abc 개발 팀의 팀장입니다. static 변수가 최소 1개 이상 포함 되어 있는 클래스를 구현하고,
//    이를 테스트하는 프로그램을 작성해 보세요. ugcadman@naver.com
public class Abc01 {

    static String nationality ;
    String name ;
    int age ;
    int attitud ;
    int mindcontrl ;
    int diligence  ;
    int selfinfo  ;

    void  display() {

        System.out.println(" 국적: " + nationality);
        System.out.println(" 이름: " + name);
        System.out.println(" 나이: " + age);

        }

    String showGradeInfo() {
        int jumsu = 0;
        String grade = "";

        if(jumsu>90) {
            grade = "상위권";
        } else if (jumsu>80) {
            grade = "중상위권";

        } else if (jumsu>70) {
            grade = "중위권";
        } else if (jumsu>60) {
            grade = "하위권";
        }else {
            grade = "부족";

        }

        return grade;
    }

}









