package Week1.OopsEx.Shape;

public class Triangle extends Shape {
    private static final double value = 0.5;
    private double base;
    private double height;

    // constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return value * base * height;
    }
}
