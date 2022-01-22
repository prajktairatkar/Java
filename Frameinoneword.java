package one;

public class Frameinoneword {
	public static void main(String args[]) {
		String s = "Vital Information Resource Under Seize";
		for(int i=0;i<s.length();i++)
		{
			if(i==0)
			{
				System.out.print(s.charAt(i)+ "");
			}
			else if(s.charAt(i)== ' ')
			{
				System.out.print(s.charAt(i+1));
			}
		}
	}

}
