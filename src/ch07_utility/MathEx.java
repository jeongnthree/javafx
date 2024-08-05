package ch07_utility_classes;
/*
수학 클래스는 매개 변수없는 생성자를 구비하고 있지만, private이므로 외부에서 접근이 불가능합니다.
모든 변수와 메소드에는 static 키워드를 제공하고 있습니다.
*/
public class MathEx {
    public static void main(String[] args) {
        // Math math = new Math(); // 생성자 접근 불가
        double d1 = -12.3456 ;
        double d2 = 34.56 ;

        System.out.println("절대값 : " + Math.abs(d1));
        System.out.println("2의 2제곱 : " + Math.sqrt(4.0));
        System.out.println("2의 3제곱 : " + Math.cbrt(8.0));
        System.out.println("올림 : " + Math.ceil(d2));
        System.out.println("버림 : " + Math.floor(d2));
        System.out.println("반올림 : " + Math.round(d2));

        int su01 = 12, su02 = 15 ;
        System.out.println("큰 수 : " + Math.max(su01, su02));
        System.out.println("작은 수 : " + Math.min(su01, su02));
        System.out.println("2의 10승 : " + Math.pow(2.0, 10.0));
        System.out.println("0이상 1미만의 랜덤 수 : " + Math.random());

        System.out.println("부호(양수) : " + Math.signum(d2));
        System.out.println("부호(음수) : " + Math.signum(d1));

        // 문제) abs() 메소드를 사용하지 않고, d1의 절대 값을 구해 보세요.
        double result = d1 * Math.signum(d1) ;
        System.out.println("d1의 절대 값 : " + result);

        int a = 14, b = 5 ;
        System.out.println("몫 : " + Math.floorDiv(a, b));
        System.out.println("나머지 : " + Math.floorMod(a, b));

        // 두 변이 3.0, 4.0인 직각 삼각형의 대변의 길이를 구하세요.
        double width = 4.0, height = 3.0 ;
        double diagonal ; // 정답은 5.0

        diagonal = Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0)) ;
        System.out.println("대각선 길이 : " + diagonal);

        // 가장 긴 변이 13.0, 중간 길이의 변이 12.0일 때, 제일 짧은 변의 길이 ?
        diagonal = 13.0 ;
        width = 12.0 ;
        // ?? height (정답은 5.0)
        height = Math.sqrt(Math.pow(diagonal, 2.0) - Math.pow(width, 2.0)) ;
        System.out.println("가장 짧은 변 : " + height);

        // 모든 요소들의 절대 값을 각 3제곱시켜 결과들의 총합을 구해 보세요.
        int[] arr = {3, -5, 4} ; // 27 + 125 + 64 = 216
		
        double imsi = 0.0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                arr[i] = Math.abs(arr[i]) ;
            }
            imsi += Math.pow(arr[i], 3.0) ;
        }
        int total = (int)imsi ;

        System.out.println("총합의 결과 : " + total);


        // 60도를 라디안으로 변환
        double degree = 60.0;
        double radian = Math.toRadians(degree);
        double cosineValue = Math.cos(radian);
        System.out.println("코사인 60도: " + cosineValue);

		double value = 0.0 ;
        System.out.println("=============================");
        // 0 <= 각도 <= 360까지 1도 단위로 싸인 값을 출력해 보세요.
        for (int i = 0; i <= 360; i++) {
            radian = Math.toRadians(i);
            value = Math.sin(radian);
            System.out.println(value);
        }

    }
}