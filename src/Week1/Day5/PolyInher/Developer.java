package Week1.Day5.PolyInher;

public class Developer extends Employee {
    public Developer(String id, String name, double salary) {
        super(id, name, salary);
    }

    //@override;
    public double calculateBonus() {
        return salary * 0.15;
    }
}
