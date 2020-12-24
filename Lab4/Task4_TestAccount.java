class Account{
  protected double balance = 0.0;
  public Account(double balance){
    this.balance = balance;
  }

  Account(){

  }

  public double getBalance(){
    return balance;
  }
}

class CheckingAccount extends Account {
	static int numberOfAccount=0;
	CheckingAccount() {
		numberOfAccount++;
	}
	CheckingAccount(double balance){
		super(balance);
		numberOfAccount++;
	}
}

public class Task4_TestAccount{
  public static void printBalance(Account a){
    System.out.println("Account Balance: " + a.getBalance());
  }
  public static void main(String [] args)
  {
    System.out.println("Number of Checking Accounts: " + CheckingAccount.numberOfAccount);
    printBalance(new CheckingAccount());
    printBalance(new CheckingAccount(100.00));
    printBalance(new CheckingAccount(200.00));
    System.out.println("Number of Checking Accounts: " + CheckingAccount.numberOfAccount);
  }
}
