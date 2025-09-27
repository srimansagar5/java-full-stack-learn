package Week1.OopsEx.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Bike("HERO", 2000);
        Vehicle v2 = new Car("HONDA", 2001);
        Vehicle v3 = new Bike("TATA", 2010);
        Vehicle v4 = new Car("YAMAHA", 2011);

        Vehicle[] vehicle = {v1, v2, v3, v4};

        for(Vehicle v: vehicle) {
            v.drive();
        }
    }
}
