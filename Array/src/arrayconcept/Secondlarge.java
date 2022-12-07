package arrayconcept;

public class Secondlarge {

	 public static void main(String[] args) {
		 
		 int Integer =4;
		 double Double =5.3;
		 //Integer = (int) Double;
		 //System.out.println(Integer);
		 Double = Integer;
		 System.out.println(Double);
		 
		int arr[] = {7,30,20,60,10,80,120,200};  
		//sorting in ascending order(7,10,20,30,60,80,120,200)
		//int arr[]={7,20,30,60,10,80,120,200}
		//int arr[]={7,20,30,10,60,80,120,200}
	    int temp;
		
		for(int i=0; i<=arr.length-1; i++)      //i=0, i=1 , i=2 ,2<=8
		{
			
			for(int j=i+1; j<=arr.length-1; j++)   // j=1, j=2, j=3
			{
				if(arr[i]>arr[j]) {        // arr[0]>arr[1], 7>30, arr[1]>arr[2], 30>20, arr[2]>arr[3], 30>60, arr[3]>arr[4] 60>10
					
					temp=arr[i];          //temp=30  
					arr[i]=arr[j];       //arr[i]=20
					arr[j]=temp;         //arr[j]=30
					}
				
				}
			
			 if(i==arr.length-3) {
				
				System.out.println(arr[i]);
			}
			
             }
		}
}


