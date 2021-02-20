class Exercise24{
	public static void main(String[] args) {
		int[] myArray = {1,2,3,5,6,7};
		int deff = myArray[0];
		//System.out.println(min);
		for(int i=0 ; i<myArray.length ; i++){
			if(myArray[i]-i != deff){
				while(deff<myArray[i]-i){
					System.out.println((i+deff) + " ");
					deff++;
				}
			}
		}
	}
}