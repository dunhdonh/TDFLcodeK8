package BT7_7;

public class Circle extends Shape {
    protected double radius;
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle (double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getPerimeter(){
        return 6.28*radius;
    }
    public String toString(){
        String coloring;
        if (filled) coloring = "is filled with color " + getColor();
        else coloring = "is unfilled";
        return "Circle " + coloring +"\nArea: "+ getArea() +"\nPerimeter: "+getPerimeter();
    }

}
