import java.util.Scanner;
public class JavaLab2 {

	public static void Task1() {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = keyboard.nextLine();
		System.out.println(str.length());
	}

	public static void Task2() {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = keyboard.nextLine();

		for (int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void Task3() {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = keyboard.nextLine();

		for (int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i) + " : " + str.codePointAt(i));
		}
	}


	public static void Task4() {
		Scanner keyboard = new Scanner(System.in);

		int arr[] = new int [3];
		int n;
		System.out.println("Enter 8 numbers:(2-4) ");
		for (int i=0; i<8; i++) {
			n = keyboard.nextInt();
			arr[n-2] = arr[n-2]+1;
		}

		for (int i=2; i<=4; i++) {
			System.out.println(i + " was found "+ arr[i-2] + " times");
		}
	}

	public static void main(String[] args) {
		// Task1();
		// Task2();
		// Task3();
		Task4();
	}

}