class Exercise13{
	public static void main(String[] args) {
		String[] myArray = {"Tuhin" , "Tethye" , "Kibria" , "Tethye" , "Tamim"};
		for(int i=0 ; i<myArray.length ; i++){
			for(int j=i+1 ; j<myArray.length ; j++){
				if(myArray[i].equals(myArray[j])){
					System.out.println(myArray[i] + " ");
				}
			}
		}
	}
}