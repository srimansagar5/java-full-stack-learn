package Week1.Day5.PolyInher;

public class ShapeTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        Shape circle = new Circle(5);

        Shape[] shapes = {rectangle, circle };

        for(Shape s: shapes) {
            System.out.println("Area: " + s.area());
        }
    }
}
