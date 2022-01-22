package one;

public class Noofnumber {
public static void main(String args[]) {
	String s = "prajkta212";
	int num=0;
	int alpha=0;
	for(int i=0;i<s.length();i++)
	{
		char ch = s.charAt(i);
		if(ch>'0' && ch< '9')
		{
			num++;
		}
		else if(ch>=65 && ch<90 || ch>= 97 && ch <=122)
		{
			alpha++;
		}
	}
	System.out.println("number of numeric in given string is:"+num);
	System.out.println("Number of character in given String is "+alpha);
}
}
