package one;

public class Replcewithstar {
	public static void main(String args[]) {
		String s = "welcome java" ;
		char ch[] = new char[s.length()];
		for(int i = 0;i<s.length();i++)
		{
			 if((s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'
					 ||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'
					 ||s.charAt(i)=='O'||s.charAt(i)=='U'))
{
	ch[i]='*';
}
			 else
			 {
				 ch[i]=s.charAt(i);
			 }
			
		}
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		

}
}