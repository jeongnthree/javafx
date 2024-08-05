package ch02_control_statement;

public class SumTest03 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;

        for(int i=1; i<11; i++){
            if(i%3==1){
                a +=i;
            }else{
                if(i>=6){
                    b +=i;}
                    else{if(i%3!=0){
                        c +=i;}

                }
            }
        }

        System.out.println("a :" + a);
        System.out.println("b :" + b);
        System.out.println("c :" + c);
    }
}
