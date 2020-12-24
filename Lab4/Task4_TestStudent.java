class Student{
	private String name = "Just a Student";
	private String department = "nothing";
	public void setDepartment(String dpt){
		this.department = dpt;
	}
	protected String getName(){
		return name;
	}
	protected void setName(String name){
		this.name = name;
	}
	public String toString(){
		return "Name : " + name + " Department: " + department;
	}
}

class BBAStudent extends Student {
	String name = "Default BBA Student";
	String department = "BBA";
	BBAStudent(){

	}
	BBAStudent(String name){
		this.name = name;
	}

	@Override
	public String toString(){
		return "Name : " + name + " Department: " + department;
	}

}
public class Task4_TestStudent{
	public static void printName(Student s){
	System.out.println(s.toString());
	}
	public static void main(String [] args){
	printName(new BBAStudent());
	printName(new BBAStudent("Humpty Dumpty"));
	printName(new BBAStudent("Little Bo Peep"));
	}
}