/*
Name: Md Naimul Islam
ID: 2014000000038
Course Code: CSE2016.1

*/


class Student {
	String name = "Default name";
	static int numberOfStudents;
	Student(){
		numberOfStudents++;
	}
	Student(String name){
		this.name = name;
		numberOfStudents++;
	}
	String getName(){
		return name;
	}

}

public class Task4_StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
	    System.out.println(s1.getName());

	    Student s2 = new Student("John");
	    System.out.println(s2.getName());

	    Student s3 = new Student("Appleseed");
	    System.out.println(s3.getName());
	    System.out.println(Student.numberOfStudents);

	}
}