import java.util.Arrays;
public class Exercise17{
	public static int[] sort(int[] myArray){
		int temp , i,j;
		for(i=0 ; i<myArray.length ; i++){
			for( j=0 ; j<myArray.length-1-i ; j++){
				if(myArray[j] > myArray[j+1]){
					temp= myArray[j];
					myArray[j] = myArray[j+1];
					myArray[j+1] = temp;
				}
			}
		}
		return myArray;
		//System.out.println(Arrays.toString(myArray));
	}
	public static void main(String[] args) {
		int[] myArray = {5,6,3,8,1};
		int[] sortValue = sort(myArray);
		System.out.println(Arrays.toString(sortValue));
		System.out.println("Second largest element = " + sortValue[sortValue.length-2]);
		
	}
}