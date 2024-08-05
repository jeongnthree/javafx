package ch03_array;

public class Array03 {
    public static void main(String[] args) {
        String [][] bts= {
            {"진", "뷔", "정국", "rm", "지민", "슈가", "제이흡"},
            {"JB", "마크", "주니어", "잭슨", "영재", "뱀뱀", "유겸"}
        };

        for (int i = 0; i < bts.length; i++) {
            for (int j = 0; j < bts.length; j++) {
                System.out.print(bts[i][j] + "\t");


            }
            System.out.println();



        }
        System.out.println();

    }



}
