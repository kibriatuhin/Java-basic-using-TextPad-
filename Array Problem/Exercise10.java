import java.util.Arrays;
class Exercise10{
	public static void main(String[] args) {
		int[] myArray = {4,3,21,35,1};
		int max=myArray[0] , min = myArray[0];
		for(int i=0 ; i<myArray.length ; i++){
			if(myArray[i] > max){
				max = myArray[i];
			}
			else if(myArray[i] < min){
				min = myArray[i];
			}
		}
		System.out.println("Array = " + Arrays.toString(myArray));
		System.out.println("Maximum numbre = " + max + "\n Minimum number = " + min);
	}
}