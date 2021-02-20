
import java.util.ArrayList;
class Exercise20{
	public static void main(String[] args) {
		 int[] myArray = {1,2,3,4,5};
        ArrayList<Integer> arrlist = new ArrayList<>();
        for (int i=0 ; i<myArray.length ; i++){
            arrlist.add(myArray[i]) ;
        }
        for (int i=0 ; i<arrlist.size() ; i++){
            System.out.print(arrlist.get(i) + " ");
        }
	}
}