package arrayconcept;

public class Spaceinsentence11 {

	public static void main(String[] args) {
		String name = "My life is my passion";
		
		int count = 0;
		
		for(int i=0; i<=name.length()-1;i++)
		{
			
			if(name.charAt(i)==' ') {
				
			count++;
			}
		}
		System.out.println(count);
	}

}
