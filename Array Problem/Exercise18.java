import java.util.Arrays;
public class Exercise18{
	public static void main(String[] args) {
		int[] myArray = sort(new int[] {4,3,1,7,5});
		System.out.println("after sort = " + Arrays.toString(myArray));
		System.out.printf("Second smalles number = " + myArray[1]);

	}
	public static int[] sort(int[] myArray){
		int temp,i,j;
		for(i=0 ; i<myArray.length ; i++){
			for(j=0 ; j<myArray.length-1-i; j++){
				if(myArray[j] >myArray[j+1]){
					temp = myArray[j];
					myArray[j] = myArray[j+1];
					myArray[j+1] = temp;
				}
			}
		}
		return myArray;
	}
	
}