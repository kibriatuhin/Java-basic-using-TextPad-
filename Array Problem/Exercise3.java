class Exercise3{
	public static void main(String[] args) {
		int[][] myArray = new int[10][10];
		for(int i=0 ; i<10; i++){
			for(int j=0 ; j<10 ; j++){
				System.out.print(" " + myArray[i][j]);
			}
			System.out.println();
		}
	}
}