package ch02_control_statement;

import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("이름 입력 :");
        String name = scan.next();

        System.out.print("학점 :");
        String grade = scan.next();

        String message = "";
        switch (grade){
            case "A": case "B":
                message = "참 잘하셨습니다.";
                break;
            case "C": case "D":
                message = "좀 더 노력하세요.";
                break;
            case "F":
                message = "다음 학기에 재수강하세요.";
            default:
                message = "잘못 입력하셨습니다.";
        }



        System.out.print(name + "님~~ " + message);



        scan.close();
    }
}
