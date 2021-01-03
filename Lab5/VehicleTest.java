/*
Name: Your name
ID: Your ID
Question: Write the name of class containing the main
method
OUTPUT:
Location of vehicle no. 1:
x: 0, y: 0
Location of vehicle no. 2:
x: 5, y: 10
Location of vehicle no. 3:
x: 10, y: 20
Location of vehicle no. 1:
x: 5, y: 10
Location of vehicle no. 2:
x: 10, y: 20
11.180339887498949
28.284271247461902
*/

import java.lang.Math;

class Vehicle {
	protected int x=0,y=0;
	static int totalVehicleCount;
	int uniqueVehicle;
	Vehicle(){
		totalVehicleCount++;
		uniqueVehicle = totalVehicleCount;
	}
	public Vehicle(int a, int b){
		x=a;
		y=b;
		totalVehicleCount++;
		uniqueVehicle = totalVehicleCount;
	}
	
	 void printVehicleLocation(){
		System.out.println("Location of Vehicle no. "+uniqueVehicle+":\nx:"+x+", y:"+y+'\n' );
	}

	void copyLocationFrom(Vehicle n){
		x = n.x;
		y = n.y;
	}

	double getDistanceFrom(Vehicle vcl){
		double n1 = Math.pow((x-vcl.x),2);
		double n2 = Math.pow((y-vcl.y),2);
		return Math.sqrt(n1+n2);
	}
}



public class VehicleTest{
	public static void main(String[]args){
		Vehicle v1 = new Vehicle();
		v1.printVehicleLocation();
		Vehicle v2 = new Vehicle(5, 10);
		Vehicle v3 = new Vehicle(10, 20);
		v2.printVehicleLocation();
		v3.printVehicleLocation();
		v1.copyLocationFrom(v2);
		v1.printVehicleLocation();
		v2.copyLocationFrom(v3);
		v2.printVehicleLocation();
		Vehicle v4 = new Vehicle(25, 30);
		System.out.println(v1.getDistanceFrom(v2));
		System.out.println(v1.getDistanceFrom(v4));
	}
}