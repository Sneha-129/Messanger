package arrayconcept;

public class R11 {

	public static void main(String[] args) {

        String name= "Sneha loyate";
        
         name= name.toLowerCase();
        
        for(char ch ='a'; ch<='z'; ch++) {
        	
        	int count=0;
        	
        	
        	for(int i=0; i<=name.length()-1; i++) {
        		
        		if(name.charAt(i)==ch) {
        			
        			count++;
        		}
        	
        	}
        	if(count!=0) 
        	
        		  System.out.print(ch+ "=" + count+" ");
        	
        	}
        }
     

	

}
