package Week1.OopsEx.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle(45.2);
        Shape s2 = new Rectangle(12.45, 11.34);
        Shape s3 = new Triangle(21.25, 22.2);

        Shape[] shapes = {s1, s2, s3};

        for(Shape s: shapes) {
            System.out.println("Area: " + s.area());
        }
    }
}
