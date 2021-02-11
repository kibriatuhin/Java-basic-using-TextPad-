class BinarySearch{
	static boolean binarySearch(int[] myArray , int value){
		int mid,left=0,right=myArray.length-1;
		while(left <= right){
			mid = (left + right)/2;
			if (myArray[mid] == value) {
				return true;
			}
			if (myArray[mid] > value) {
				left = mid + 1;
			}else {
				right = mid + 1;
			}

		}
		return false;
	}
	public static void main(String[] args) {
		int[] myArray = {7,6,5,4,3,2,1};
		boolean result = binarySearch(myArray,2);
		System.out.println(result);
	}
}