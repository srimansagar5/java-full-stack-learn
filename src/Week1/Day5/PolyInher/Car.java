package Week1.Day5.PolyInher;

public class Car extends Vehicle {
    public Car(String brand, double speed) {
        super(brand, speed);
    }

    public void drive() {
        System.out.println(brand + " Car is driving at " + speed + " km/h.");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Hero", 120.00);

        myCar.drive();
        System.out.println("Car Brand: " + myCar.brand);
    }
}
