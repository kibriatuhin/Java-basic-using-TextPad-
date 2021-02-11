
public class LinearSearch{
	public static boolean  linearSearch(int[] myArray , int value){

		for (int i=0; i<myArray.length; i++) {
			if (myArray[i] == value) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] myArray = {5,6,7,8,9,10};
		boolean result = linearSearch(myArray,9);
		System.out.println(result);
		
	}
}