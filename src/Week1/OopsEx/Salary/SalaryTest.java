package Week1.OopsEx.Salary;

public class SalaryTest {
    public static void main(String[] args) {
        Salary s1 = new Salary(100000.00);
        Salary s2 = new Salary(-25000.00);
        s2.setSalary(50000.00);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("After raise: " + s1.raiseSalary(5.00));
        System.out.println("After raise: " + s2.raiseSalary(3.00));
    }
}
