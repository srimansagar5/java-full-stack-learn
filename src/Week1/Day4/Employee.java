package Week1.Day4;

public class Employee {
    //Encapsulation
    //Field: private
    // getter and setter: getter: return value; setter: set the values.
    // to access setter and getter: public methods;

    //Challagne:
//    Challenge 3: Employee Salary Update
//    Create an Employee class with private fields: id, name, salary.
//    Add a method raiseSalary(double percent) that increases salary.
//    Ensure salary cannot be set directly.
//    Print updated salary after raise.

    private String id;
    private  String name;
    private double salary;

    //constructor
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        if(salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("The Salary set to Zero.");
            this.salary = 0;
        }
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public double getSalary() { return salary; }

    public void raiseSalary(double percent) {
        if(percent > 0) {
            double increaseSalary = (salary * percent)/100;
            salary = salary + increaseSalary;
            System.out.println("Salary increased by " + percent + " percent.");
        } else {
            System.out.println("Invalid percentage. Must be > 0.");
        }

    }
    public void displayEmployeeDetails() {
        System.out.println(
                "Employee ID: " + id
                 + "; Employee Name: " + name
                  + "; Employee Salary: " + String.format("%.2f", salary));
    }
    public static void main(String[] args) {
        Employee emp = new Employee("EMP239", "Cony", 100000.00);

        emp.displayEmployeeDetails();
        emp.raiseSalary(5.0);
        emp.displayEmployeeDetails();

    }
}
