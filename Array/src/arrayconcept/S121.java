package arrayconcept;

public class S121 {

	public static void main(String[] args) {
		
		String name = "Sammsung";
		int count =0;
		
		char ch = 'm';
		
		for(int i= 0; i<name.length()-1; i++) {
			
			if(ch==name.charAt(i)) {
				
				count++;
				
			}
			
			System.out.println(ch+ " " + count);
		}
	

	}

}
