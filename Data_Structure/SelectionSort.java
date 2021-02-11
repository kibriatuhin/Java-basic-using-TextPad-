import java.util.Arrays;
class SelectionSort{
	static void selectionSort(int[] myArray){
		int i,j,temp,max_Index;
		for( i=0 ;i<myArray.length ; i++){
			max_Index = i;
			for(j=i+1 ; j<myArray.length ; j++){
				if(myArray[j] > myArray[max_Index]){
					max_Index = j;
				}
			}
			if(max_Index != i){
				temp = myArray[i];
				myArray[i] = myArray[max_Index] ;
				myArray[max_Index] = temp;
			}
		}
		System.out.println(Arrays.toString(myArray));
	}
	public static void main(String[] args) {
		int[] myArray = {4,5,6,3,7,2};
		SelectionSort.selectionSort(myArray);
	}
}