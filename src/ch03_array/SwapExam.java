package ch03_array;

public class SwapExam {
    public static void main(String[] args) {
        int x = 3, y = 4 ;
        System.out.println("before data");
        System.out.printf("x : %d, y = %d\n", x,y);

        int temp = x;
        x = y ;
        y = temp ;

        System.out.println("after data");
        System.out.printf("x : %d, y = %d\n", x,y);

        // 최종 결과물이 x=4, y=5, z= 3이 되도록 swap 기법을 사용해 보세요
        x = 3 ;
        y = 4 ;
        int z = 5 ;

        temp = x;
        x = y;
        y = z;
        z = temp;


        System.out.println("before data");
        System.out.printf("x : %d, y = %d, z = %d\n", x,y,z);

        //배열 요소를 역순으로 뒤집기
        int[] arr = {1,2,3,4,5};

        int cnt = arr.length/2;

        for (int i = 0; i < cnt ; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length -1 -i];
            arr[arr.length -1 -i]= temp;

        }

        System.out.println("swap된 결과의 배열");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);

        }

    }
}
