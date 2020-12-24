/*
Name: Md Naimul Islam
ID: 2014000000038
Course Code: CSE2016.1

*/

class Vehicle {
    static int vehicleCount;
    int a,b;

    Vehicle(){
        vehicleCount++;
    }
    public void printCoords(){
        System.out.println("(" + a + ", " + b + ")");
    }

    public void setCoords(int x, int y){
        a =x;
        b = y;
    }
}

public class Task5_VehicleTest{
  public static void main(String [] args){
    System.out.println(Vehicle.vehicleCount);
    Vehicle v1 = new Vehicle();
    v1.setCoords(1,3);
    v1.printCoords();

    System.out.println(Vehicle.vehicleCount);
    Vehicle v2 = new Vehicle();
    v2.setCoords(2,5);
    v2.printCoords();
    System.out.println(Vehicle.vehicleCount);
    Vehicle v3 = new Vehicle();
    System.out.println(Vehicle.vehicleCount);
  }
}
