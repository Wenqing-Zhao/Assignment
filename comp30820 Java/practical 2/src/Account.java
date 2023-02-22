import java.util.Date;

public class Account {
    // Set several variables according to the assignment requirements
    private int id;
    private double balance;
    private Date dateCreated;
    private double annualInterestRate;

    // Implement a constructor with no parameters
    public Account() {
        this.id = 0;
        // Use the Date class to get the time of object instance
        this.dateCreated = new Date(); 
    }

    // Implement a constructor with parameters
    public Account(int id, int balance, Date dateCreated){
        this.id = id;
        this.balance = balance;
        this.dateCreated = dateCreated;
    }

    // Create get and set methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }

    // Calculate the monthly interest by the formula
    public double getMonthlyInterest(){
        return balance * annualInterestRate / 12;
    }

    // To withdraw money, subtract the balance of the account from the amount of money withdrawn
    public void withdraw(double amount){
        balance -= amount;
    }

    // The toString method prints out the id and balance and the time of instance
    public String toString(){
        return String.valueOf(this.id) + " " + String.valueOf(this.balance) + " " + String.valueOf(this.dateCreated);
    }

}