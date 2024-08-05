package ch02_control_statement;

import java.util.Scanner;

public class AdultCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("이름 입력 :");
        String name = scan.next();

        System.out.print("나이 입력 :");
        int age = scan.nextInt();

        System.out.print("성별(1,2,3,4 중 택일) 입력 :");
        int _gender = scan.nextInt();

        String adult = "";
        if (age>=19) {
            adult = "성인";
        }else {
            adult = "미성년자";

        }

        String gender = "";
        if (_gender==1 || _gender==3){
            gender = "남성";
        }else {
            gender = "여성";
        }

        String message = "이름 : %s님, 나이 : %d세, 성인 체크 : %s, 성별 : %s";
        System.out.printf(message,name,age,adult,gender);


        scan.close();
    }
}
