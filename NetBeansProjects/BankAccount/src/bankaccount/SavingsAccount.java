

/**
 *
 * @author Jingwen
 */
public class SavingsAccount extends BankAccount{
    private static double annualInterestRate;
    

    public SavingsAccount() {
    }

    public SavingsAccount(int accountNumber, String name, double balance){
        super(accountNumber, name, balance);
    }

    public void setAnnualInterestRate(double annualInterestRate){
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate(){
        return SavingsAccount.annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 1200;
    }

    public double getMonthlyInterest(){
        return super.getBalance() * getMonthlyInterestRate();
    }

    @Override
    public String toString(){
        return super.toString() + "\nAccount type: Savings\n";
    }
}

