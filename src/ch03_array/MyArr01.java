package ch03_array;

public class MyArr01 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;

        System.out.println("x :" +x);
        System.out.println("y :" +y);

        int[] arr = new int[3] ;

        arr[0] = x-y+6;
        arr[2] = arr[0] +3 ;
        arr[1] = arr[0] + arr[2] ;

        System.out.println("배열 요소 출력하기");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        // 중괄호 기호를 사용하여 초기화 기법으로 배열을 정의합니다.
        int[] arr2 = {10,20,30};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);

        }


    }
}
