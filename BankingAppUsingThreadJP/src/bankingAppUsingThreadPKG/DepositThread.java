package bankingAppUsingThreadPKG;                          // declared package

// this program overrides the run method to deposit the amount for a single thread at a time

public class DepositThread implements Runnable {
	
	private AccountTransactions account;                  // Declaring the variable of type account transaction class type
	   
    private double amount;                                 // Declaring the variable of type double
   
    public DepositThread(AccountTransactions account, double amount)    // Declaring the constructor for DepositThread class
    {
        this.account = account;
        this.amount = amount;
    }

    public void run()                            // Run method overriden in class withdrawThread
    {
 	   account.deposit(amount);             // calling a deposit method
    }

}
