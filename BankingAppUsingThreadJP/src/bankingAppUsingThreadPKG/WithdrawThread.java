package bankingAppUsingThreadPKG;      // declared package

// this program overrides the run method to withdraw the amount for a single thread at a time

public class WithdrawThread implements Runnable {
	
	
    private AccountTransactions account;                  // Declaring the variable of type account transaction class type
   
    private double amount;                                 // Declaring the variable of type double
    
    public WithdrawThread(AccountTransactions account, double amount)        // Declaring the constructor for WithdrawThread class
      {
        this.account = account;
        this.amount = amount;
      }
    public void run()                     // Run method overriden in class withdrawThread
      {
   	     account.withdraw(amount);   // calling a withdraw method
      }

}
