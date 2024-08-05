package ch04_class;

public class SaramMain03 {
    public static void main(String[] args) {
        Saram03 yusin = new Saram03() ;
        Saram03 soon = new Saram03() ;

        yusin.setName("김유신"); // 쓰기
        soon.setName("유관순"); // 쓰기

        System.out.println(yusin.getName());

//        yusin.name = "김유신";
//        yusin.weight = 70.5;
    }
}
