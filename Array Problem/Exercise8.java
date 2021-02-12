import java.util.Arrays;
class Exercise8{
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5};
		int[] myArray2 = new int[myArray.length];
		for(int i=0 ; i<myArray.length ; i++){
			myArray2[i] = myArray[i];
		}
		System.out.println("new Array = " + Arrays.toString(myArray2));
	}
}