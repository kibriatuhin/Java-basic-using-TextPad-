import java.util.Scanner;
class Exercise4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter array length = " );
		int len = sc.nextInt();
		float sum = 0;
		int[] myArray = new int[len];
		System.out.printf("Enter %d array value = " , len);
		for(int i=0 ; i<myArray.length ;i++){
			myArray[i] = sc.nextInt();
		}

		for(int i=0 ; i<myArray.length  ; i++){
			sum = sum + myArray[i] ;
		}
		System.out.println("Avarage = " + sum/myArray.length);

	}
}