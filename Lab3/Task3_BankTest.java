/*
Name: Md Naimul Islam
ID: 2014000000038
Course Code: CSE2016.1

*/

class BankAccount {
	private String name, address, accountID;
	private double balance;

	BankAccount(String name, String address, String accountID, double balance){
		this.name = name;
		this.address = address;
		this.accountID = accountID;
		this.balance = balance;
	};

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAccountID(){
		return accountID;
	}
	public void setAccountID(String accountID){
		this.accountID = accountID;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void addInterest(){
		balance = balance + balance*0.07;
	}
}

public class Task3_BankTest{
	public static void main(String[] args) {
		// first instance
		BankAccount acc1 = new BankAccount("John","Mripur,Dhaka","B1001",30000);
		
		acc1.addInterest();
		System.out.println(acc1.getName()+ " from " + acc1.getAddress() + " gets " + acc1.getBalance() + " per month.");

		// second instance
		BankAccount acc2 = new BankAccount("Smith","Sydney, Australia","B1002",35000);
		System.out.println(acc2.getName()+ " from " + acc2.getAddress() + " gets " + acc2.getBalance() + " per month.");

		// third instance
		BankAccount acc3 = new BankAccount("Max","Melbourne, Australia","B1003",40000);
		System.out.println(acc3.getName()+ " from " + acc3.getAddress() + " gets " + acc3.getBalance() + " per month.");
	}
}