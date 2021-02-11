import java.util.Scanner;
public class Test7{

	public static void main(String[] args) {
		Scanner sc = new ScannerS(System.in);
		int[] myArray = new myArray[5];
		int[] newArray;
		//user input
		System.out.printf("Enter any five number = ");
		for (int i=0 ; i<myArray.length ; i++){
			myArray[i] = sc.nextInt();
		}
		// user input 2
		System.out.printf("Enter contain number = ");
		int value = sc.nextInt();
		//output
		for (int i=0 ; i<myArray.length ; i++ ) {
			if (value == myArray[i]) {
				continue;
			}
		    newArray = myArray[i];
		}
		for (int i=0; i< newArray.length ; i++ ) {
			System.out.println(newArray[i] + " ");
		}
	}
}