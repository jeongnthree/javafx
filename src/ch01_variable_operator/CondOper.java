package ch01_variable_operator;

public class CondOper {
    public static void main(String[] args) {
       int x = 7;
       int y = 5;
       int z = 9;


       int max = x > y ? x : y;
       max = max > z ? max : z;
       System.out.println("max;" + max );

       int min = x < y ? x : y;
       min = min < z ? min : z;

       System.out.println("min;" + min);
    }
}
