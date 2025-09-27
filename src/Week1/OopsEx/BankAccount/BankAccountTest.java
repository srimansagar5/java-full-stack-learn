package Week1.OopsEx.BankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("SBI1234543", 50000.00);

        System.out.println(bankAccount);

        bankAccount.deposit(50000.00);
        System.out.println(bankAccount);


        bankAccount.withdraw(20000.00);
        System.out.println(bankAccount);


        bankAccount.setAccountNumber("ICICI093394183");
        System.out.println(("My New account numer is "+ bankAccount.getAccountNumber() +", Current balance is " + bankAccount.getBalance() ));

        System.out.println(bankAccount);


    }
}
