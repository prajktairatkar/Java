package stringedu;

public class Checkalphabet {
	public static void main(String args[]) {
		String s="hell";
		boolean flag = false; char ch;
		for(int i=0;i<s.length();i++)
	{
		 ch = s.charAt(i);
		if(ch>= 65 && ch<=90 || ch>=97 && ch<=122)
		{
			flag = true;
		}
		else if(ch> '0' && ch< '9')
		{
			flag = false;
		}
		
	}
		if(flag==true)
			
		{
			System.out.println("contains only alphabates");
		}
		else
		{
			System.out.println("String contains both alphabet and numeric ");
		}
	}

}
