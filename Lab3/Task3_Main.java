/*
Name: Md Naimul Islam
ID: 2014000000038
Course Code: CSE2016.1

*/

class Student {
	private String name, id, address;
	private double cgpa;

	Student(String name, String id, String address, double cgpa){
		this.name = name;
		this.id = id;
		this.address = address;
		this.cgpa = cgpa;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getID(){
		return id;
	}
	public void setID(String id){
		this.id = id;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public double getCGPA(){
		return cgpa;
	}
	public void setCGPA(double cgpa){
		this.cgpa = cgpa;
	}
}

public class Task3_Main {
		public static void main(String[] args) {

			// instance of John
			Student john = new Student("John","Mirpur","SEU1001",3.5);

			System.out.println(john.getName() + " from " + john.getAddress() + " carries cgpa " + john.getCGPA() + " out of 4");

			// Instance of Mike
			Student mike = new Student("Mike","Uttara","SEU1002",3.6);

			System.out.println(mike.getName() + " from " + mike.getAddress() + " carries cgpa " + mike.getCGPA() + " out of 4");

			// Instance of carol
			Student carol = new Student("Carol","Banani","SEU1003",3.4);

			System.out.println(carol.getName() + " from " + carol.getAddress() + " carries cgpa " + carol.getCGPA() + " out of 4");
		}
	}