package stringedu;

public class Howmanynoofchat {
public static void main(String args[]) {
	String s = "1234";
	//char ch = 'A'+1;
	//System.out.println();
boolean flag = false;
	for(int i=0;i<s.length();i++)
{
	char ch = s.charAt(i);
	if(ch>='0' && ch<='9')
	{
		flag = true;
	}
	
}
	if(flag==true)
		
	{
		System.out.println("contains only  numeric");
	}
	else
	{
		System.out.println("String contains non numeric");
	}
}
}
