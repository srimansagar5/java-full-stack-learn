package Week1.OopsEx.Shape;

public class Circle extends Shape{
    private static final double PI = 3.14159265359;
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return PI * radius * radius;
    }
}
