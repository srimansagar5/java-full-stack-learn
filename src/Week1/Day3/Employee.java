package Week1.Day3;

public class Employee {
    // fields: id, name, basicSalary
    String id;
    String name;
    double basicSalary;

    // constructor
    public Employee(String id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    //calculateAnnualSalary() that multiplies monthly salary × 12.
    public double calculateAnnualSalary() {
        return  basicSalary * 12;
    }

    //Print details along with annual salary.
    public void  printDetails() {
        System.out.println(
                "Employee ID: " + id +
                ", Name: " + name +
                ", Monthly Salary: " + String.format("%.2f", basicSalary) +
                ", Annual Salary: " + String.format("%.2f", calculateAnnualSalary())
        );
    }

    public static void main(String[] args) {
        Employee emp = new Employee("3249", "John Smith", 10000.00);

        emp.printDetails();
    }
}
