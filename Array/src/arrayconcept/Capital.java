package arrayconcept;

public class Capital {

	public static void main(String[] args) {
		String name ="i love india";
		for(int i= 0; i<=name.length()-1; i++)
		{
			char ch = name.charAt(i);
			if(ch=='d')
			{
				ch='D';
			}
			System.out.print(ch);
		}
	}

}
