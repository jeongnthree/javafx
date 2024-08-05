package ch07_utility_classes;

import java.util.Arrays ;
import java.util.List;

public class MyArrayExam {
    public static void main(String[] args) {
        String[] arr1 = new String[3];
        Arrays.fill(arr1, "제시카") ;
        printArray(arr1) ;

        Arrays.fill(arr1, 1, 3, "티파니") ;
        printArray(arr1) ;

        Arrays.fill(arr1, 2, 3, "써니") ;
        printArray(arr1) ;

        String[] arr2 = {"제시카" ,"티파니" ,"써니"} ;
        String[] arr3 = {"제시카" ,"티파니" ,"써니", "효연"} ;

        // Arrays.equals() 메소드는 static 메소드입니다.
        // 요소의 개수 및 값이 완전 일치해야만 true 값을 반환합니다.
        System.out.println("배열 1과 2가 동일한가요?");
        System.out.println(Arrays.equals(arr1, arr2));

        System.out.println("배열 1과 3가 동일한가요?");
        System.out.println(Arrays.equals(arr1, arr3));
		
        // 다음 equals() 메소드는 Object 클래스에 들어 있는 메소드입니다.
        // 배열도 참조형 자료이므로 다음은 false를 반환해 줍니다.
        System.out.println(arr1.equals(arr2));

        Arrays.sort(arr3);
        printArray(arr3);

        System.out.println("binarySearch는 우선 정렬이 되어야 합니다.");
        String finddata = "제시카" ;
        int idx = Arrays.binarySearch(arr3, finddata) ;
        System.out.println(finddata + "의 인덱스 : " + idx);

        String[] arr4 = {"김", "이", "최", "박"};

        // asList 메소드는 배열을 리스트 형식으로 만들어 줍니다.
        // 리스트는 순서가 있는 자료 구조
        List<String> lastNames = Arrays.asList(arr4) ;

        // for(데이터타입  개별이름 : 복수를지칭 ){
        for(String human : lastNames){
            System.out.println(human + "씨");
        }

        System.out.println("copyOf를 사용한 배열 복사");
        String[] arr5 = {"미국", "영국", "한국", "중국", "일본"};
        for (int i = 1; i <= 10 ; i++) {
            String[] arr6 = Arrays.copyOf(arr5, i) ;
            printArray(arr6);
        }

        System.out.println("copyOfRange를 사용한 배열의 특정 색인만 복사");
        String[] arr7 = Arrays.copyOfRange(arr5, 1, 4) ;
        printArray(arr7);

        String[] arr8 = {"나", "가", "아", "다", "라"} ;
        Arrays.sort(arr8, 1, 4);
        printArray(arr8);

        Arrays.sort(arr5);
        printArray(arr5);

        System.out.println(Arrays.toString(arr5));
    }

    private static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }
}
