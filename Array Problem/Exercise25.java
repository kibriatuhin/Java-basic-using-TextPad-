class Exercise25{
	public static void main(String[] args) {
		int[] myArray = {1,2,3,5,6};
		int[] myArray2 = {7,8,3,5,10};
		int[] myArray3 = {11,12,3,5,14};

		for(int i=0 ; i<myArray.length ; i++){
			for(int j=0 ; j<myArray2.length ; j++){
				for(int k=0 ; k<myArray3.length ; k++){
					if(myArray[i]==myArray2[j] && myArray[i]== myArray3[k]){
						System.out.println(myArray[i]);
					}
				}
			}
		}
	}
}