package Week1.OopsEx.Employee;

public class Intern extends Employee {
    //Constructor
    public Intern(double bonus, double baseAmount) {
        super(bonus, baseAmount);
    }

    public void displayBonusInfo() {
        double bonus = getBonus();
        if(bonus == 0 || bonus < 0) {
            System.out.println("This year no bonus for the Intern.");
        } else if(bonus > 0 && bonus < 2) {
            System.out.println("The Intern meets all targets and great.");
        } else {
            System.out.println("The Intern meets all targets and promoted to Developer.");
        }
    }
}
