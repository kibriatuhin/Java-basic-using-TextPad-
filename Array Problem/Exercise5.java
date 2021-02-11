import java.util.Arrays;
import java.util.Scanner ;
class Exercise5{
	public static boolean contains(int[] myArray , int value){
		for(int i=0 ; i<myArray.length ; i++){
			if(myArray[i] == value){
				return true;
			}

		}
		return false;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter array length = " );
		int len = sc.nextInt();
		int[] myArray = new int[len];
		System.out.printf("Enter %d array value = ", len );
		for(int i=0 ; i<myArray.length ; i++){
			myArray[i] = sc.nextInt();
		}
		System.out.printf("Enter find value = " );
		int value = sc.nextInt();
		//call contain method
		boolean result = contains(myArray, value);
		System.out.println(result);
	}
}

class Test{
	public static boolean contains(int[] myArray , int value ){
		for(int i=0 ; i<myArray.length ; i++){
			if(myArray[i] == value){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5};
		int value = 5;
		// call contain method
		boolean result = contains(myArray , value);
		System.out.println("Orginal Array = " + Arrays.toString(myArray));
		System.out.println(result);

	}
}