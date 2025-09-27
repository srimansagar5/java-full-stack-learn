package Week1.OopsEx.BankAccount;

//Bank Account (Encapsulation)
//Create BankAccount with private fields accountNumber, balance.
//Add getters and controlled setters.
//Test deposit and withdrawal.

public class BankAccount {
    private  String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        if(balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid amount entered. Balance set to zero.");
            this.balance = 0.00;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

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
            System.out.println("Insufficient balance or Invalid withdrawal amount");
        }
    }

    public String toString() {
        return "Bank Account Details: Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
