import java.util.Arrays;
class Exercise11{
	public static void main(String[] args) {
		int[] myArray = {5,6,7,8,9,10};
		System.out.println("Orginal Array = " + Arrays.toString(myArray));
		int i=0 , temp ;
		while(i<myArray.length/2){
			temp = myArray[i];
			myArray[i] = myArray[myArray.length -1-i];
			myArray[myArray.length -1-i] = temp;
			i++;
		}
		System.out.println("Reverse Array = " + Arrays.toString(myArray));

	}
}