package Week1.OopsEx.Employee;

public class Manager extends Employee{
    //Constructor
    public Manager(double bonus, double baseAmount) {
        super(bonus, baseAmount);
    }

    public void displayBonusInfo() {
        double bonus = getBonus();

        if(bonus == 0 || bonus < 0) {
            System.out.println("This year no bonus for the Managers.");
        } else if(bonus > 0 && bonus < 3) {
            System.out.println("The Manager meets all targets and great.");
        } else {
            System.out.println("The Manager meets all targets and promoted to Sr.Manager.");
        }
    }
}
