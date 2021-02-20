class Exercise28{
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5};
		int max=myArray[0] , min = myArray[0];
		for(int i=0 ; i<myArray.length ; i++){
			if(myArray[i] > max){
				max = myArray[i];
			}
			else if(myArray[i] < min){
				min= myArray[i];
			}
		}
		System.out.println("maximum = " + max + "\n minimum = " + min + "\nDifferance =  " + (max-min));
	}
}