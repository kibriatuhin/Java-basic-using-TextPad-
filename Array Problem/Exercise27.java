class Exercise27{
	public static void main(String[] args) {
		int[] myArray = {1,2,3,4,5,6};
		int count =0 ;
		for(int i=0 ; i<myArray.length ; i++){
			if(myArray[i]%2 == 0){
				count++;
			}
		}
		System.out.println("Even = " + count + "\nOdd = " + (myArray.length-count));
	}
}