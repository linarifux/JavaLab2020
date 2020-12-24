import java.util.Scanner;
public class Quiz {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int arr[] = new int [3];
		int n;
		for (int i=0; i<8; i++) {
			n = keyboard.nextInt();
			arr[n-2] = arr[n-2]+1;
		}

		for (int i=2; i<=4; i++) {
			System.out.println(i + " was found "+ arr[i-2] + " times");
		}
	}
}