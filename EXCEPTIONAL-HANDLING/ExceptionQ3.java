class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String str)
    {
        super(str);
    }
}
class IllegalBankTransactionException extends InsufficientBalanceException {

	public IllegalBankTransactionException(String str) {
        super(str);
    }
}
class  savingAccount{
    private final long id ;
    private double balance  ;
    public savingAccount(long id,double balance){
        this.id=id;
        this.balance=balance;
    };
    public  double withdraw(double amount) throws RuntimeException {
        try {
            if(balance<amount){
                throw new InsufficientBalanceException ("Insufficient balance in account");
            }
            balance -= amount ;
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        return  balance ;
    }
public  double deposit(double amount) throws RuntimeException {
    try {
        if(amount<=0){
            throw new IllegalBankTransactionException("The amount should always be greater than 0");
        }
        balance -= amount ;
    }
    catch (IllegalBankTransactionException ez) {
        System.out.println(ez.getMessage());
    }
	return amount;

    }    
    public  double getBalance()  {
        return  balance ;
    }
	public long getId() {
		return id;
	}
}
public class ExceptionQ3 {
    public static void main(String[] args)  {
        savingAccount PulkitChauhan = new savingAccount(10,2000);
        PulkitChauhan.deposit(-1);
        PulkitChauhan.withdraw(2100);
        System.out.println(PulkitChauhan.getBalance());
    }
}