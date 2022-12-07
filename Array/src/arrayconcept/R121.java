package arrayconcept;

public class R121 {

	public static void main(String[] args) {
		
		String name ="Samsung";
		
		String rev=" ";
		
		for(int i= name.length()-1; i>=0; i--)      //string is palidrome
		{
			
			rev= rev+name.charAt(i);
		}
		
		System.out.println(rev);
	
	
          if(rev.equals(name))
          {
        	  
        	  System.out.println("String is palidrome or not");
          }
          
          else
          {
        	  System.out.println("String is not palidrome");
          }
}
}

