package Week1.OopsEx.Vehicle;

//Vehicle Inheritance
//Base Vehicle class with method drive().
//Subclasses: Car, Bike → override drive().
//Store them in a Vehicle[] and loop.
public abstract class Vehicle {
    protected String model;
    protected int year;

    // Constructor
    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println("Vehicle is running...");
    }
}
