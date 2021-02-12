import java.util.Arrays;
class Exercise9{
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5};
		int indexNumber = 2 , indexValue= 7;
		System.out.println("Orginal Array = " + Arrays.toString(myArray));
		for(int i=0 ; i< myArray.length ; i++){
			if(i == indexNumber){
				myArray[i] = indexValue; 
			}
		}
		System.out.println("After insert = " + Arrays.toString(myArray));

	}
}