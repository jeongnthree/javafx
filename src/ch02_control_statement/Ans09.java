package ch02_control_statement;


import java.util.Scanner;

public class Ans09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("이름 입력 :" );
        String name =scan.next();

        System.out.println("나이 입력 :" );
        int age =scan.nextInt();

        System.out.print("키(신장) 입력 :"  );
        double height =scan.nextDouble();

        System.out.print("성별 입력(1,2,3,4중 택일) :" );
        int _gender =scan.nextInt();

        String gender = _gender == 1|| _gender == 3 ? "남자" : "여자" ;

        System.out.println("\n이전 출력 방식");
        System.out.println("이름 : " + name + "님");
        System.out.println("나이 : " + age);
        System.out.println("신장 : " + height);
        System.out.println("성별 : " + gender);

        System.out.println("\nprintf 사용한 방식");
        System.out.printf("이름 : %s님,", name);
        System.out.printf("나이 : %d세\n", age);
        System.out.printf("키 : %fcm\n", height);
        System.out.printf("성별 : %s\n", gender);

        String  message = "제 이름은 %s이고, 나이는 %c살이고 키는 %.3fcm입니다.";
        System.out.printf(message, name, age, height);



    }
}
