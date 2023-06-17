

/**
 *2023-06-17
 * @author Jingwen
 */
import java.util.Date;
public class BankAccount{
    private int accountNumber;
    private String name;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public BankAccount() {
        this.accountNumber = 1000;
        this.name = "";
        this.balance = 0;
        this.dateCreated = new Date();
    }

    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.dateCreated = new Date();        
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(this.balance < amount){
            System.out.println("Balance is insufficient.");
        }else{
            this.balance -= amount;
        }
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public String toString(){
        return String.format("%s%d%n%s%s%n%s%.2f%n%s%s", 
        "AccountNumber:", this.accountNumber, "Account holder's name:", 
                this.name, "AccountBalance:", this.balance, "Date Account Created:", 
                this.dateCreated);
    }
}