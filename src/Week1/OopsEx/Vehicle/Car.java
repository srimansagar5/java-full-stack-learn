package Week1.OopsEx.Vehicle;

public class Car extends Vehicle {
    //Constructor
    public Car(String model, int year) {
        super(model, year);
    }

    @Override
    public void drive() {
        System.out.println(model + " Car is running and manufactured in year " + year);
    }
}
