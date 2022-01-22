package one;

public class Uniquestring {
	public static void main(String args[]){
	String s = "computer";
	boolean flag =true;
	for(int i=0;i<s.length();i++)
	{
		char ch= s.charAt(i);
		for(int j=i+1;j<s.length();j++)
		{
			if(ch==s.charAt(j))
			{
				flag=false;
				break;
			}
		}
	}
if(flag==true)
{
	System.out.println("unique");
}
else
{
	System.out.println("not unique");
}
}
}
