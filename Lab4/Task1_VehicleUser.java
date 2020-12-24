class Vehicle {
	int x=0,y=0;
	Vehicle(){

	}
	void moveUp(){
		y++;
	}
	void moveLeft(){
		x--;
	}
	void moveDown(){
		y--;
	}
	void moveRight(){
		x++;
	}
	String printCoords(){
		return ("("+x+", "+y+")");
	}
}


public class Task1_VehicleUser{
	public static void main(String[] args){
		Vehicle car = new Vehicle();

		System.out.println(car.printCoords());
		car.moveUp();
		System.out.println(car.printCoords());
		car.moveLeft();
		System.out.println(car.printCoords());
		car.moveDown();
		System.out.println(car.printCoords());
		car.moveRight();

		System.out.println(car.printCoords());
	}
}