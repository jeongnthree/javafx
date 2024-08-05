package ch02_control_statement;

public class For07 {
    public static void main(String[] args) {
        double even = 0.0, odd = 0.0;


        for (int i = 1; i < 101; i++) {
            if(i%2==0){
            even += (double) 1/i;
            }else {
                odd +=(double) 1/i;

            }


        }
        double total = odd - even ;
        System.out.println("총합 :" +total);



    }
}
