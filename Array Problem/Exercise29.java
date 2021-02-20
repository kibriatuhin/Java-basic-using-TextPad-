class Exercise29{
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5};
		int min=myArray[0] , max = myArray[0], count =0;
		float sum =0;
		for(int i=0 ; i<myArray.length ; i++){
			if(myArray[i] > max){
				max = myArray[i];
			}
			else if(myArray[i] < min){
				min = myArray[i];
			}

		}
		for(int i=0 ; i<myArray.length ; i++){
			if(myArray[i] != max && myArray[i] != min){
				sum = sum + myArray[i];
				count++;
			}
		}
		System.out.println("Avarage = " + (sum/count));
	}
}