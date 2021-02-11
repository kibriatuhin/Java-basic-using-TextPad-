import java.util.Arrays;
class Exercise1{
	public static void main(String[] args) {
		int[] myArray = {4,3,7,1,5};
		String[] myArray2 = {"Tuhin","Afra","Ibnat", "Kibria"};
		System.out.println("Orginal Array = " + Arrays.toString(myArray));
		Arrays.sort(myArray);
		System.out.println("After using sort = " + Arrays.toString(myArray));

		System.out.println("Orginal Array = " + Arrays.toString(myArray2));
		Arrays.sort(myArray2);
		System.out.println("After using sort = " + Arrays.toString(myArray2));
	}
}