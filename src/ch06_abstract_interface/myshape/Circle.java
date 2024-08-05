package ch06_abstract_interface.myshape;

public class Circle extends Shape{
    private double radius;
    private double xpos;
    private double ypos;

    public Circle(String linecolor, String fillcolor, double radius,double xpos, double ypos) {
        super(linecolor, fillcolor);
        this.radius = radius;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    @Override
    public double calcArea() {
        return Math.PI*Math.pow(this.radius,2.0);
    }

    @Override
    public double calcPerimeter() {
        return 2.0*Math.PI*this.radius;
    }

    @Override
    public void display() {
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();
        System.out.println("원 정보 :");
        System.out.println("면적 : "+ super.area);
        System.out.println("원 둘레 :" + super.perimeter);


//        String message = "면적 : %.3f\n";
//        System.out.println(message, super.area);
//
//        message = "운 중심 : (%.1f, %1f), 반지름 : %.1f\n";

    }
}
