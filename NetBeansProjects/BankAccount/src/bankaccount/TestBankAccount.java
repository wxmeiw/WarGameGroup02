
/**
 *
 * @author Jingwen
 */
public class TestBankAccount {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount
            (1001, "John P Smith", 20000);
        SavingsAccount savings = new SavingsAccount
            (1002, "Janet E Holland", 10000);

        checking.withdraw(2500);
        savings.deposit(3000);

        savings.setAnnualInterestRate(4.5);

        accountInformation(checking);
        accountInformation(savings);
        System.out.printf(
            "Monthly interest amount of savings account is: %.2f%n",
            savings.getMonthlyInterest());
    }

    public static void accountInformation(BankAccount account){
        if(account instanceof SavingsAccount){
            System.out.println(((SavingsAccount)account).toString());
        }else if(account instanceof CheckingAccount){
            System.out.println(((CheckingAccount)account).toString());
        }    
    }
}

