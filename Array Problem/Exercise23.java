class Exercise23{
	public static void main(String[] args) {
		int[] myArray = {1,2,3,5,6,8,9};
		int value = 15;

		for(int i=0 ; i<myArray.length ; i++){
			for(int j=i+1 ; j< myArray.length ; j++){
				if(myArray[i]+myArray[j] == value){
					System.out.println(myArray[i] + "+" + myArray[j] + " = " + value);
				}
			}
		}
	}
}