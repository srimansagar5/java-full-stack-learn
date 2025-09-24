package Week1.Day4;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("EMP9879", "Cony Mark", 100000.00);

        emp.displayEmployeeDetails();
        emp.raiseSalary(15.00);
        emp.displayEmployeeDetails();

    }
}
