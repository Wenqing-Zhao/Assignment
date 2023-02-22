import java.util.Date;

public class AccountTest {
    public static void main(String[] args) {
        // Create an instance of the Account class
        // Also, set the id, balance and time of instance
        Account account = new Account(101, 20000, new Date());

        // Make adjustments to the balance and interest rate
        account.setAnnualInterestRate(0.045);
        account.withdraw(2500);
        account.withdraw(-3000);

        // Call the methods in the Account class to calculate the balance and monthly interest
        // Output account creation time
        System.out.println("The balance is " + account.getBalance());
        System.out.println("The monthly interest is " + account.getMonthlyInterest());
        System.out.println("The date when the account was created is " + account.getDateCreated());
    }
}
