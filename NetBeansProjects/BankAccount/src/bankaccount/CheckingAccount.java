

/**
 *
 * @author Jingwen
 */
public class CheckingAccount extends BankAccount{
    protected int overdraftLimit;

    public CheckingAccount(){

    }

    public CheckingAccount(int accountNumber, String name, double balance){
        super(accountNumber, name, balance);
    }

    @Override
    public String toString(){
        return super.toString() + "\nAccount type: Checkings\n";
    }
}
