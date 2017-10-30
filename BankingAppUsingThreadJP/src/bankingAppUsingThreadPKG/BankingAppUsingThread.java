package bankingAppUsingThreadPKG;              // declared the package

public class BankingAppUsingThread {                   // declared and defined the class                

	public static void main(String[] args) {                // main method
		// TODO Auto-generated method stub
		
				AccountTransactions account;               //declared the class Account
				
				account = new AccountTransactions(20000);           // Assigning the Balance to account
				new Thread(new DepositThread(account,1000)).start();   // passing deposit object with deposit amount and calling start method
				new Thread(new WithdrawThread(account,2000)).start();   // passing withdraw object with withdraw amount and calling start method
				new Thread(new DepositThread(account,5000)).start();   // passing deposit object with deposit amount and calling start method
				new Thread(new DepositThread(account,1000)).start();  // passing deposit object with deposit amount and calling start method
				new Thread(new WithdrawThread(account,2000)).start();  // passing withdraw object with withdraw amount and calling start method
				new Thread(new WithdrawThread(account,100)).start();  // passing withdraw object with withdraw amount and calling start method

	}

}
