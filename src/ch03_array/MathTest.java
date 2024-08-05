package ch03_array;

public class MathTest {
    public static void main(String[] args) {
        int su = -12;
        System.out.printf("%d의 절대값은 %d입니다.\n", su, -su);

        int su02=Math.abs(su);
        System.out.printf("%d의 절대값은 %d입니다.\n", su, -su02);

        double[] arr = {1.1, -2.2, -3.3};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                arr[i] = Math.abs(arr[i]);
            }

        }

        System.out.println("절대값으로 변경된 결과");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %.2f\n", i, arr[i]);

        }

    }
}
