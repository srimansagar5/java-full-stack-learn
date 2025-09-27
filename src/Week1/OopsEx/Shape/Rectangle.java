package Week1.OopsEx.Shape;

public class Rectangle extends Shape{
    private double length;
    private double width;

    //constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() {
        return length * width;
    }
}
