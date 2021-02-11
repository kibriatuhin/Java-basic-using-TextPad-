import java.util.Scanner;
import java.util.Arrays;
class Exercise6{
	public static int findIndex(int[] myArray , int value){
		for(int i=0 ; i<myArray.length ; i++){
			if(myArray[i] == value){
				return i;
			}

		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter array length = ");
		int len = sc.nextInt();
		int[] myArray = new int[len];
		System.out.printf("Enter %d array value = " , len);
		for(int i=0 ; i<myArray.length ; i++){
			myArray[i] = sc.nextInt();
		}
		System.out.printf("Enter find value = " );
		int value = sc.nextInt();

		//call findIndex method
		int index = findIndex(myArray, value);
		System.out.printf("value of %d array index = %d\n",value,index);
	}
}
class Test{
	public static int findIndex(int[] myArray , int value){
		for(int i=0 ; i<myArray.length ; i++){
			if(myArray[i] == value){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5};
		int findIndexValue = 4;
		//call method
		System.out.println(findIndex(myArray,findIndexValue));
	}
}