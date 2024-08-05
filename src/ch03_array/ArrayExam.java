package ch03_array;

//p116
//절대값으로 바꾸고 배열 요소값 자리 변경
public class ArrayExam {
    public static void main(String[] args) {
        int[] a = {10, -20, 30, -40, 50};
        System.out.print("배열 원본 출력 : \n");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

        System.out.println("\n배열 역순 결과 : ");

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = Math.abs(a[i]);
            }
        }
            int temp = 0;
//            temp = a[0];
//            a[0] = a[4];
//            a[4] = temp;

            int cnt = a.length / 2;
            for (int j = 0; j < cnt; j++) {
                temp = a[j];
                a[j] = a[a.length - j - 1];
                a[a.length - j - 1] = temp;
            }

        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]+"\t");
        }
    }
}
