package ch06_abstract_interface.myshape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shape = {
                new Triangle("yellow", "black", 15.0, 10.0),
                new Rectange("red", "green", 20.0, 10.0),
                new Circle("pink", "blue", 5.0, 3.0, 4.0 )
        };

        for (int i = 0; i < shape.length; i++) {
            shape[i].display();
            shape[i].draw();
            System.out.println();


        }
        System.out.println("========================");
        System.out.println("추상 클래스는 불완전 클래스라서 객체 생성이 안 됩니다.");
        Shape sample01 = new Shape() {
            @Override
            public double calcArea() {
                return 0;
            }

            @Override
            public double calcPerimeter() {
                return 0;
            }

            @Override
            public void display() {
                System.out.println("Anonymous Inner Type 호출됨");

            }
        };

        for (int i = 0; i < 3; i++) {
            sample01.display();

        }

        Shape sample02;
        sample02 = new Rectange("blue", "green", 10.0, 10.0);
        sample02.display();
        sample02.draw();


    }
}
