package arrayconcept;

public class Spattern {

	public static void main(String[] args) {
		int i,  j,  row=5;
		
		for(i=0;i<=row;i++)
		{
			for(j=2*(row-i); j>=0; j--)
			{
				System.out.print(" ");
				}
			for(int j1=0; j1<=i; j1++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
			}
			
			
		}
	
}
