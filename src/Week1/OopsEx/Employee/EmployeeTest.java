package Week1.OopsEx.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Manager(3.00, 100000.00);
        Employee e2 = new Manager(0.93, 200000.00);

        Employee e3 = new Developer(5.00, 80000.00);
        Employee e4 = new Intern(10.00, 10000.00);

        Employee[] employees = {e1, e2, e3, e4};

        for(Employee e: employees) {
            System.out.println(e.calculateBonus());
            e.displayBonusInfo();

        }
    }
}
