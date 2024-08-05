package ch02_control_statement;

public class BreakContinue {
    public static void main(String[] args) {
        String hello = "안녕하세요.~~";

        System.out.println("break 구문은 가장 가까운 반복문을 완전히 빠져 나갑니다.");
        for (int i = 1; i < 11; i++) {
            if(i%3==0){
                break;
            }
            System.out.println(hello + i + "번째 뵙네요");
        }


        System.out.println("continue 구문은 이번 시행을 건너 띄고 다음 시행으로 이동합니다.");
        for (int i = 1; i < 11; i++) {
            if(i%3==0){
                continue;
            }
            System.out.println(hello + i + "번째 뵙네요");
        }
    }
}
