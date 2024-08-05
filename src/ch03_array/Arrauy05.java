package ch03_array;

public class Arrauy05 {
    public static void main(String[] args) {

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        double[] arr = new double[5];



        System.out.println("요소들 값 할당");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }

        System.out.println("요소들 출력");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        double max = Double.MAX_VALUE;
        double min = Double.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max += arr[i];


        } else if (arr[i]<min) {
                min = arr[i];

            }


        }

        System.out.println("\n최대값); " + max);
    }
}
