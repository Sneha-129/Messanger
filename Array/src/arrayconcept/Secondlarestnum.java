package arrayconcept;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Secondlarestnum {

	public static void main(String[] args) {
		int arr[] = {30,20,60,10,80,120};
		
		Arrays.sort(arr);
		
		for(int i=0; i<=arr.length-2; i++) {
			
			if(i==(arr.length-2)) {
				
				System.out.println(arr[i]);
				
			}
		}
		
			
		}
		

}
