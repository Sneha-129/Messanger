package arrayconcept;

public class OccuranceOfChar {

	public static void main(String[] args) {
		String s = "I lovee bhuinj";
		
		
		occurance (s,'e');
	}

	public static void occurance (String s, char ch)  //occurance
	{
		int count = 0;
		
		for(char st : s.toCharArray()) {
			
			if(st==ch)
			{
				count++;
			}
		
		}
		System.out.println(count);

	}

}
