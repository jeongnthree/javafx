package ch02_control_statement;

public class ForSwitch01 {
    public static void main(String[] args) {
        int sum0 = 0, sum1 = 0, sum2 = 0;


        for(int i =1; i<11; i++){
           switch(i%3){
               case 0:
                   sum0 += i;
                   break;

               case 1:
                   sum1 += i;
                   break;

               case 2:
                   sum2 += i;
                   break;



           }
        }
        System.out.println("3배의 배수의 총합 : " + sum0);
        System.out.println("3으로 나웠을때 1의 총합 : " + sum1);
        System.out.println("3으로 나웠을때 2의 총합 : " + sum2);


    }
}
