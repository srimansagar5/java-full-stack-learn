package Week1.Day4;

public class BankAccount {
    // private fields: accountNumber, balance
    private String accountNumber;
    private double balance;

    //constuctor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // getter methods for accountNumber and balance
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    //public methods: deposit(amount) and withdraw(amount) update the balance only if valid.
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

    // prevent direct modification of balance;
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount("AC123", 5000);

        System.out.println("Account: " + userAccount.getAccountNumber());
        System.out.println("Balance: " + userAccount.getBalance());

        userAccount.deposit(10000);
        userAccount.withdraw(1000);

        userAccount.balance = 500;
        System.out.println("Account balance: " + userAccount.balance);
    }

}
