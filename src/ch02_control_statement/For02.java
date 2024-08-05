package ch02_control_statement;

public class For02 {
    public static void main(String[] args) {
        int odd = 0; int even =0;

        for(int i = 1; i<11; i++){
            if(i%2==0){
               even += 1;

            }else {odd +=1;}
        }
        System.out.println("짝수의 합 :" + even);
        System.out.println("홀수의 합 :" + odd);

    }
}
