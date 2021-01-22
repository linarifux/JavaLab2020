class Account{
	private double balance = 0.0;
	Account(double balance){
		this.balance = balance;
	}
	double getBalance(){
		return balance;
	}
}

class CheckingAccount extends Account {
	static int numberOfAccount=0;
	CheckingAccount(){
		super(0.0);
		numberOfAccount++;
	}
	CheckingAccount(double b){
		super(b);
		numberOfAccount++;
	}

	public String toString(){
  		return "Account Balance: " + getBalance();  
 	}

}

public class AccountBalanceTester{
	public static void main(String[]args){
		String displayText = "Number of Checking Accounts: ";
		System.out.println(displayText + CheckingAccount.numberOfAccount);
		System.out.println(new CheckingAccount());
		System.out.println(displayText + CheckingAccount.numberOfAccount);
		System.out.println(new CheckingAccount(100));
		System.out.println(displayText + CheckingAccount.numberOfAccount);
		System.out.println(new CheckingAccount(10.50));
		System.out.println(displayText + CheckingAccount.numberOfAccount);
		CheckingAccount a = new CheckingAccount(50);
	}
}