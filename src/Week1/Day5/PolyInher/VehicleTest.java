package Week1.Day5.PolyInher;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Car("TATA", 120.00);
        Vehicle v2 = new Bike("YAMAHA", 80.00);

        Vehicle[] vehicles = {v1, v2};

        for(Vehicle v: vehicles) {
            v.drive();
        }
    }
}
