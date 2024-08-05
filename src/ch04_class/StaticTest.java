package ch04_class;

public class StaticTest {
    public static void main(String[] args) {
        System.out.println("static 변수 참조 : " + Mathematics.first);

        Mathematics math = new Mathematics();
        System.out.println("instance 변수 참조 : " + math.second);

        int result = StaticTest.abs(-12);
        System.out.println("절대 값 : " + result);

        int x = 3, y = 5;
        result = Mathematics.max(x, y);
        System.out.println("큰 수 : " + result);

        result = math.min(x, y);
        System.out.println("작은 수 : " + result);

        StaticTest st = new StaticTest();
        st.sayHello("김철수");
    }

    private void sayHello(String name) { // 인사말을 출력해주는 instance 메소드
        System.out.println(name + "님 안녕하세요.^^");
    }

    private static int abs(int x) { // 절대 값을 구해주는 static 메소드
        return x < 0 ? -x : x ;
    }
}
