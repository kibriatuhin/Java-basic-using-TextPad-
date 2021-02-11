import java.util.Scanner;
class Exercise2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter 5 Array value = " );
		int[] myArray = new int[5];
		for(int i=0 ; i<myArray.length ; i++){
			myArray[i] = sc.nextInt();
		}
		int sum = 0 ;
		for(int i=0 ; i<myArray.length ; i++){
			sum = sum + myArray[i];
		}
		System.out.println("Sum of array = " + sum);
	}
}