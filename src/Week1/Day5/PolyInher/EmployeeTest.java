package Week1.Day5.PolyInher;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Manager("ID8329", "Bruce Wayne", 50000.00);
        Employee e2 = new Developer("ID3432", "Dent", 20000.00);

        Employee[] employees = {e1, e2};
        for(Employee e: employees) {
            System.out.println(e.name + " Bonus: " + e.calculateBonus());
        }
    }
}
