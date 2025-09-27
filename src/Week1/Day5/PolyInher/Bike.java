package Week1.Day5.PolyInher;

public class Bike extends Vehicle {
    public Bike(String brand, double speed) {
        super(brand, speed);
    }

    public void drive() {
        System.out.println(brand + " Bike is driving at " + speed + " km/h.");
    }

    public static void main(String[] args) {
        Bike myBike = new Bike("Yamaha", 80.00);

        myBike.drive();
    }
}
