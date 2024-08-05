package ch02_control_statement;

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("이름 입력 :");
        String name = scan.next();

        System.out.print("등급 입력 :");
        String grade = scan.next();


        switch (grade){
            case "A" :
                System.out.println("[강남 빌당, 고급 승용차, 노트북]을 경품으로 줍니다.");
                break;
            case "B" :
                System.out.println("[고급 승용차, 노트북]을 경품으로 줍니다.");
                break;
            case "C" :
                System.out.println("[노트북]을 경품으로 줍니다.");

        }


        scan.close();
    }
}
