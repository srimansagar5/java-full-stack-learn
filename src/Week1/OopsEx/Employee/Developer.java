package Week1.OopsEx.Employee;

public class Developer extends Employee {
    //Constructor
    public Developer(double bonus, double baseAmount) {
        super(bonus, baseAmount);
    }

    public void displayBonusInfo() {
        double bonus = getBonus();
        if(bonus == 0 || bonus < 0) {
            System.out.println("This year no bonus for the Developer.");
        } else if(bonus > 0 && bonus < 2) {
            System.out.println("The Developer meets all targets and great.");
        } else {
            System.out.println("The Developer meets all targets and promoted to Sr.Developer.");
        }
    }
}
