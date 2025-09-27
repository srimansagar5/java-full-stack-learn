package Week1.OopsEx.Employee;

//Employee Hierarchy
//Base Employee with calculateBonus().
//Subclasses: Manager, Developer, Intern (different bonus %).
//Use polymorphism to print bonuses.

public abstract class Employee {
    private double bonus;
    private double baseAmount;

    //Constructor
    public Employee(double bonus, double baseAmount) {
        setBonus(bonus);
        this.baseAmount = baseAmount;
    }

    public double getBonus(){ return bonus;}
    public double getBaseAmount() {return baseAmount;}

    public void setBonus(double bonus) {
        this.bonus = (bonus > 0) ? bonus: 0.0;
    }

    public double calculateBonus(){ return (bonus * baseAmount)/100;};
    public abstract void displayBonusInfo();
}
