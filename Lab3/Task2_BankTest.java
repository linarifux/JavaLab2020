/*
Name: Md Naimul Islam
ID: 2014000000038
Course Code: CSE2016.1

*/

class BankAccount {
	private String name, address, accountID;
	private double balance;

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

public class Task2_BankTest{
	public static void main(String[] args) {
		// first instance
		BankAccount acc1 = new BankAccount();
		acc1.setName("John");
		acc1.setAddress("Mirpur,Dhaka-1216");
		acc1.setAccountID("B1001");
		acc1.setBalance(30000);
		acc1.addInterest();
		System.out.println(acc1.getName()+ " from " + acc1.getAddress() + " gets " + acc1.getBalance() + " per month.");

		// second instance
		BankAccount acc2 = new BankAccount();
		acc2.setName("Smith");
		acc2.setAddress("Sydney, Australia");
		acc2.setAccountID("B1002");
		acc2.setBalance(35000);
		System.out.println(acc2.getName()+ " from " + acc2.getAddress() + " gets " + acc2.getBalance() + " per month.");

		// third instance
		BankAccount acc3 = new BankAccount();
		acc3.setName("Max");
		acc3.setAddress("Melbourne, Australia");
		acc3.setAccountID("B1003");
		acc3.setBalance(40000);
		acc3.addInterest();
		System.out.println(acc3.getName()+ " from " + acc3.getAddress() + " gets " + acc3.getBalance() + " per month.");
	}
}