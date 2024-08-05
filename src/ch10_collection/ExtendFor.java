package ch10_collection;

public class ExtendFor {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30};

        System.out.println("일반 for 구문 방식");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        System.out.println("확장(향상) for 구문 방식");
        for(int item:arr){
            System.out.println(item);
        }

        String fruits[] = new String[]{"apple", "melon", "orange"};
        for(String item:fruits){
            System.out.println(item);
        }
    }
}








