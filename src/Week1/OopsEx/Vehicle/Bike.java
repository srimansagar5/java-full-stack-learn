package Week1.OopsEx.Vehicle;

public class Bike extends Vehicle {

    //Constructor
    public Bike(String model, int year) {
        super(model, year);
    }

    @Override
    public void drive() {
        System.out.println(model + " Bike is driving and it manufactured in " + year);
    }
}
