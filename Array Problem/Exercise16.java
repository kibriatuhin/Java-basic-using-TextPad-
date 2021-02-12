import java.util.Arrays;
class Exercise16{
	public static void main(String[] args) {
		int[] myArray = {1,2,4,2,4,5,6,6};
		for(int i=0 ; i<myArray.length  ; i++){
			for(int j=i+1 ; j<myArray.length ; j++ ){
				if(myArray[i] == myArray[j]){

					for(int k=j ; k<myArray.length-1 ; k++){
						myArray[k] = myArray[k+1];

					}
					
					myArray[myArray.length-1]= 0;

				}
			}
		}
		System.out.println("After remove = " + Arrays.toString(myArray));
	}
}