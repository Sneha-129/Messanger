package arrayconcept;

public class Largestnumber {

	public static void main(String[] args) {
		
		int [] arr ={30,60,50,10,20};
		
		int max = arr[0];
		
		for(int i =0; i<=arr.length-1;i++)
		{
			
			if(arr[i]>max)
				
			{
				
				max = arr[i];
				
			}
		}
		
      System.out.println(max);
}
}