import java.util.Scanner;
import java.util.Arrays;
class Exercise7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter array length = ");
		int len = sc.nextInt();
		int[] myArray = new int[len];
		System.out.printf("Enter %d array value = " , len);
		for(int i=0  ; i<myArray.length ; i++){
			myArray[i] = sc.nextInt(); 
		}

		System.out.printf("Enter remove index = " );
		int value = sc.nextInt();

		//call method
		removeElement(myArray,value);
	}
	public static void removeElement(int[] myArray , int value){
		System.out.println("Orginal Array = " + Arrays.toString(myArray));
		for(int i=value ; i<myArray.length-1 ; i++){
			myArray[i] = myArray[i+1]; 
		}
		myArray[myArray.length-1] = 0;

       System.out.println("After remove = " + Arrays.toString(myArray));
	}
}
//test
class Test{
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5};
		int removeIndex = 2;
		//method call
		removeElement(myArray,removeIndex);
	}
	public static void removeElement(int[] myArray , int value){
		System.out.println("Orginal Array = " + Arrays.toString(myArray));
		for(int i=value ; i<myArray.length-1 ; i++){
			myArray[i] = myArray[i+1]; 
		}
		myArray[myArray.length-1] = 0;

       System.out.println("After remove = " + Arrays.toString(myArray));
	}
}
class Test2{
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5};
		int removeIndex = 2;
		//method call
		removeElement(myArray,removeIndex);
	}
	public static void removeElement(int[] myArray , int value){
		System.out.println("Orginal Array = " + Arrays.toString(myArray));
		for(int i=0 ; i<myArray.length ; i++){
			if(myArray[i] == value){
				for(int j=i ; j<myArray.length-1 ; j++){
					myArray[j] = myArray[j+1];
				}
			}
		}
		myArray[myArray.length-1] = 0;

       System.out.println("After remove = " + Arrays.toString(myArray));
	}
}