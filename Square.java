package BT7_7;

public class Square extends Rectangle {
    protected double side;
    public Square(){
    }
    public Square(double side){
        super(side, side);
    }
    public Square (double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public void setLength(double side){
        super.length = side;
    }
    public void setWidth(double side){
        super.width = side;
    }
    public String toString(){
        String coloring;
        if (filled) coloring = "is filled with color " + getColor();
        else coloring = "is unfilled";
        return "Square " + coloring +"\nArea: "+ getArea() +"\nPerimeter: "+getPerimeter();
    }

}
