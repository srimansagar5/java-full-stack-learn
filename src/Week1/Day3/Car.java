package Week1.Day3;

public class Car {
    // fields: brand, model, year
    String brand;
    String model;
    int year;

    // constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //start() method: "Car is starting..."
    public void start() {
        System.out.println(model + " Car is starting...");
    }

    // Create multiple objects for different car brands;
    public static void main(String[] args) {
        Car myCarOne = new Car("TATA", "Safari", 2000);
        Car myCarTwo = new Car("Mahendra", "Thar", 2010);

        myCarOne.start();
        myCarTwo.start();


    }
}
