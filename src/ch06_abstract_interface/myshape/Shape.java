package ch06_abstract_interface.myshape;

public abstract class Shape {
    protected double area;
    protected double perimeter ;
    private String linecolor;
    private String fillcolor;

    public abstract double calcArea();
    public abstract double calcPerimeter();
    public abstract void display();

    public Shape() {
    }

    public Shape(String linecolor, String fillcolor) {
        this.linecolor = linecolor;
        this.fillcolor = fillcolor;
    }

    protected final void draw(){
        System.out.println("라인 색상 :"+this.linecolor);
        System.out.println("채우기 색상 :"+this.fillcolor);
    }
}
