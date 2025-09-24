package Week1.Day4;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount("AC453", 50000);

        System.out.println(
                "Account Details: "
                + userAccount.getAccountNumber()
                + " Balance: "
                + userAccount.getBalance()
        );
        userAccount.withdraw(5000);
        System.out.println("Withdraw: 5000, Balance: " + userAccount.getBalance());
        // not able access balance field directly.
    }
}
