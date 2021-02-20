import java.util.Scanner;
class Exercise19{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] myArray = new int[2][3];
		int[][] myArray2 = new int[2][3];
		System.out.printf("Enter matrix 1 = ");
		for(int row=0 ; row<2 ; row++){
			for(int col=0 ; col<3 ; col++){
				myArray[row][col] = sc.nextInt();
			}
		}
		System.out.printf("Enter matrix 2 = ");
		for(int row=0 ; row<2 ; row++){
			for(int col=0 ; col<3 ; col++){
				myArray2[row][col] = sc.nextInt();
			}
		}

System.out.println("Sum of two matrix = ");
		for(int row=0 ; row<2 ; row++){
			for(int col=0 ; col<3 ; col++){
				System.out.print((myArray[row][col]+myArray2[row][col]) + " ");
			}
			System.out.println();
		}

	}
}