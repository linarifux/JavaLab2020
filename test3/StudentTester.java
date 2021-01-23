
public class StudentTester{
public static void main(String [] args){
Student s0 = new Student();
Student s1 = new Student("Bob", "1");
Student s2 = new Student("Tom", "2");
Printer pr = new Printer();
pr.printDetail(s0);
pr.printDetail(s1);
pr.printDetail(s2);
}
}

class Student {
	String name="Unassigned",id="Unassigned";
	Student(){

	}
	Student(String a, String b){
		this.name = a;
		this.id = b;
	}
}

class Printer{
	void printDetail(Student n){
		System.out.println("Name of the Student: "+n.name);
		System.out.println("ID of the Student: "+n.id);
	}
}