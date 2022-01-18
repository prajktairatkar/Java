package stringedu;

public class Wordcal {
	public static void main(String args[]) {
		String s="prajkta iratkar";
		int c =0; 
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)== ' ')
			{
				c++;
			}
			
		
		}
		System.out.println("Number of words "+ (c+1));

}
}
