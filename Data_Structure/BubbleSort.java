import java.util.Arrays;
class BubbleSort{
	public static void main(String[] args) {
		int[] myArray = {5,4,2,7,3};
		int temp;
		System.out.println("Orginal Array = " + Arrays.toString(myArray));
		for(int i=0 ; i<myArray.length ; i++){
			for(int j=0 ; j<myArray.length-i-1 ; j++){
				if(myArray[j] > myArray[j+1]){
					temp = myArray[j];
					myArray[j] = myArray[j+1];
					myArray[j+1] = temp;
				}
			}
		}
		System.out.println("After using bubble sort = " + Arrays.toString(myArray));
	}
}