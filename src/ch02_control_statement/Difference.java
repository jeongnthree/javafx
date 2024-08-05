package ch02_control_statement;

public class Difference {
    public static void main(String[] args) {
        int sumA = 0, sumB=0;

        for(int i=1; i<51; i++){
            if(i%3==0){
                sumB +=i;
            }else {
                sumA +=i;
            }
        }
        System.out.println("sumA-sumB :" + (sumA-sumB));

    }

}
