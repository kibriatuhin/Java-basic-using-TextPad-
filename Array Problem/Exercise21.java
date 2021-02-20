import java.util.ArrayList;
import java.util.Arrays;
class Exercise21{
	public static void main(String[] args) {
		
		 ArrayList<Integer> arrList = new ArrayList<>();


        for(int i=0 ; i<5 ; i++){
            arrList.add(i);
        }
        int[] myArray = new int[arrList.size()];


        for(int i=0 ; i<arrList.size() ; i++){
            myArray[i] = arrList.get(i);
        }
        System.out.println(Arrays.toString(myArray));
	}
}