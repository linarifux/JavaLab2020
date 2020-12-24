import java.util.Scanner;
import java.lang.Math;

class Point {
	private double radius;
	Point ( double r) {
	radius = r;
}
	double space ( ) {
		System.out.println("Space for a Point can’t be defined");
		return 0;
	}
	protected double getRadius(){
		return radius;
	}
}

class Circle extends Point {
	double r;
	Circle(double radius){
		super(radius);
		r=radius;
		System.out.println("Creating a circle....done!");
	}

	@Override
	double space(){
		return Math.PI*r*r;
	}
}

class Sphere extends Point {
	double r;
	Sphere(double radius){
		super(radius);
		r = radius;
		System.out.println("Creating a Sphere....done!");
	}

	@Override
	double space(){
		return Math.PI*r*r*4;
	}
}

public class Task2_CircleTest{
public static void main(String[]args){
Scanner kb = new Scanner(System.in);
System.out.print("nter radius of circle: ");
double circleRadius = kb.nextDouble();
Circle circleObj = new Circle(circleRadius);
System.out.println("The area of the circle is " +circleObj.space());
System.out.println("");
System.out.print("Enter radius of sphere: ");
double spehereRadius = kb.nextDouble();
Sphere sphereObj = new Sphere(spehereRadius);
System.out.println("The area of the sphere is " +sphereObj.space());
}
}