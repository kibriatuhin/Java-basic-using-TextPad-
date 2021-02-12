class Exercise14{
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5};
		int[] myArray2 = {6,2,8,9,1};

		for(int i=0 ; i<myArray.length ; i++){
			for(int j=0 ; j<myArray2.length ; j++){
				if(myArray[i] == myArray2[j]){
					System.out.println(myArray[i]);
				}
			}
		}
	}
}