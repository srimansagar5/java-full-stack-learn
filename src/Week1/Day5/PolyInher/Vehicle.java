package Week1.Day5.PolyInher;

public class Vehicle {
//    Create a Vehicle base class with fields: brand, speed.
//    Add a method drive() that prints "Vehicle is driving...".
//    Create subclasses Car and Bike that override the drive() method with their own messages.
//    Test polymorphism by storing them in a Vehicle[] array and calling drive().

    protected String brand;
    protected double speed;

    // constructor
    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void drive() {
        System.out.println("Vehicle is driving....");
    }

    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("Honda", 180.00);
        myVehicle.drive();
    }
}
