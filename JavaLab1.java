import java.util.Scanner;
import java.lang.Math;

public class JavaLab1 {


public static void Task1() {
	Scanner keyboard = new Scanner(System.in);

	int number = keyboard.nextInt();
	System.out.println(number);
}

public static void Task2() {
	Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter voltate: ");
	double v = keyboard.nextDouble();
	System.out.print("Enter Resistance: ");
	double r = keyboard.nextDouble();
	System.out.print("Enter Inductance: ");
	double i = keyboard.nextDouble();
	System.out.print("Enter capacitance: ");
	double c = keyboard.nextDouble();
	System.out.print("Enter frequencey: ");
	double f = keyboard.nextDouble();

	double current = v/(Math.sqrt(Math.pow(r,2)+Math.pow(((2*Math.PI*f*i)-(1/(2*Math.PI*f*c))),2)));

	System.out.println(current);
}


public static void Task3() {
	Scanner keyboard = new Scanner(System.in);

	for (int i=1; i<=5; i++) {
		System.out.print("Enter " + i + " number: ");
		System.out.println("You have entered: " + keyboard.nextInt() );
	}
}


public static  void Task4() {
	Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = keyboard.nextInt();
	if (number % 2 == 0) {
		System.out.println("Even");
	}else{
		System.out.println("Odd");
	}
}

public static void Task5() {
	Scanner keyboard = new Scanner(System.in);

	int arr [] = new int[10];

	for (int i=0; i<10; i++) {
		System.out.print("Enter " + (i+1) + " number: ");
		arr[i] = keyboard.nextInt();
	}

	System.out.println("The entered numbers in reversed order: ");
	for (int i=9; i>=0; i--) {
		System.out.println(arr[i]);
	}
}

public static void Task6() {
	Scanner keyboard = new Scanner(System.in);

	int arr [] = new int[5];

	System.out.println("Enter 5 numbers: ");
	for (int i=0; i<5; i++) {
		arr[i] = keyboard.nextInt();
	}

	System.out.println("The even numbers are: ");
	for (int i=0; i<5; i++) {
		if (arr[i] % 2 == 0) {
			System.out.print(arr[i] + " ");
		}
	}
	System.out.println("");
}

public static void Task7() {
	Scanner keyboard = new Scanner(System.in);

	int arr [] = new int[5];

	System.out.println("Enter 5 numbers: ");
	for (int i=0; i<5; i++) {
		arr[i] = keyboard.nextInt();
	}

	System.out.println("Odd numbers in reversed order: ");
	for (int i=4; i>=0; i--) {
		if (arr[i] % 2 == 1) {
			System.out.print(arr[i] + " ");
		}
	}
	System.out.println("");
}

public static void Task8() {
	Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter the value of n: ");
	int n = keyboard.nextInt();

	int arr [] = new int[n];
	double result = 0;

	System.out.println("Enter n numbers: ");
	for (int i=0; i<n; i++) {
		arr[i] = keyboard.nextInt();
	}

	for (int i=0; i<n; i++) {
		if (i == (n-1)) {
			result = result + (Math.pow(arr[i],2));
		}else{
			if (arr[i] % 2 == 0) {
				result = result + (-(Math.pow(arr[i],2)));
			}else {
					result = result + ((Math.pow(arr[i],2)));
				}
		}
		
	}

	System.out.println("The value of Y is: " + result);
}

	public static void main(String[] args) {
		// Task1();
		// Task2();
		// Task3();
		// Task4();
		// Task5();
		// Task6();
		// Task7();
		Task8();
	}
}