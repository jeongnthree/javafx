package ch06_abstract_interface.myshape;

public class Rectange extends Shape{
    private double width;
    private double height;

    public Rectange(String linecolor, String fillcolor, double width, double height) {
        super(linecolor, fillcolor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return (this.width * this.height);
    }

    @Override
    public double calcPerimeter() {
        return (this.width*2)+(this.height*2);

    }

    @Override
    public void display() {
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();
        System.out.println("면적 : "+ super.area);
        System.out.println("둘레 : "+super.perimeter);


    }
}
