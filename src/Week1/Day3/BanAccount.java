package Week1.Day3;

public class BanAccount {
    // declare variables
    String accountNumber;
    double balance;

    // constructor function with two variables.
    public BanAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // deposit logic
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // withdraw logic
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " | Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficent balance or Invalid withdrawal amount");
        }
    }
    // display account information

    public void displayAccountInformation() {
        System.out.println("Account: " + accountNumber + " | Balance: " + balance);
    }

    public static void main(String[] args) {
        BanAccount myAccount = new BanAccount("984830283", 50000.00);

        myAccount.displayAccountInformation();
        myAccount.deposit(15000.00);
        myAccount.withdraw(10000.00);
        myAccount.withdraw(80000.00);
    }
}
