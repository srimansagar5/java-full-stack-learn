package Week1.Day5.PolyInher;

public class Employee {
    //Fields
    String id;
    String name;
    double salary;

    // constructor
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // method
    public double calculateBonus() {
        return salary * 0.1;
    }
}
