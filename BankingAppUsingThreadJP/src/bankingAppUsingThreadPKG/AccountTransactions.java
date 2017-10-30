package bankingAppUsingThreadPKG;           // declared package

public class AccountTransactions {                // declared and defined class
	
	// Declare the Variable of type double 
    private double balance = 0;
    // constructor of account hold the balance
    public AccountTransactions(double balance)
      {
          this.balance = balance;
      }
    // if the keyword ‘synchronized’ is removed, the outcome will be  unpredictable
    public synchronized void deposit(double amount) 
    {
   	 // check amount is in negetive for deposit  then throw exception
      if (amount < 0) 
        {
   	   // throw exception
          throw new IllegalArgumentException("Amount less than Zero, Please enter a valid amount.");
        }
      // increase the Balance of the account
         this. balance += amount;
         // display the balance to user
         System.out.println(" Deposit " + amount + " INR using thread  " + Thread.currentThread().getId() + ", Balance after Deposit is               "+balance);
    }
    // if the keyword ‘synchronized’ is removed, the outcome will be  unpredictable
    public synchronized void withdraw(double amount) 
    {
   	 // validating the amount entered is passes condition or not
      if (amount < 0 || amount > this.balance) 
        {
   	   // if validation fails throw below exception
           throw new IllegalArgumentException("Insufficiant Balance.");
        }
      	// decrease the Amount from the Balance
          this.balance -= amount;
          //Display the Balance to users
          System.out.println(" Withdraw  " + amount +" INR using thread " + Thread.currentThread().getId() + ", Balance after withdrawal is                "+balance);
    }

}
