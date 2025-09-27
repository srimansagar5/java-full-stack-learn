package Week1.OopsEx.Salary;

//Employee Salary Update (Encapsulation + Method)
//Private salary.
//Method raiseSalary(percent) updates salary.
//Print details.

public class Salary {
    private double salary;

    //Constructor
    public Salary(double salary) {
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 0){
            this.salary = salary;
        } else {
            System.out.println("Please enter proper salary; Basic salary set to default salary 10000");
            this.salary = 10000.00;
        }
    }

    public double raiseSalary(double percent) {
        if (percent > 0) {
            return salary += salary * (percent / 100.0);
        }
        return salary;
    }

    public String toString() {
        return String.format("Employee salary: %.2f", salary);
    }
}
