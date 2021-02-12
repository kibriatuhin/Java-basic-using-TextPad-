class Exercise12{
	public static void main(String[] args) {
		int[] myArray = {1,2,3,2,3,4,5};
		for(int i=0 ; i<myArray.length ; i++){
			for(int j=i+1 ; j<myArray.length ; j++){
				if(myArray[i] == myArray[j]){
					System.out.print(myArray[i] + " ");
				}
			}
		}
	}
}