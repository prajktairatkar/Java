package stringedu;

public class Checknumericoralpha {
public static void main(String args[]) {
	String s = "pra121";
	// boolean flag = false;
	int num = 0; int alpha = 0;
	for(int i = 0;i<s.length();i++)
	{
		char ch = s.charAt(i);
		if(ch>'0' && ch<='9')
		{
			num++;
		}
		else if(ch>=65 && ch<=90)
		{
			alpha++;
		}
	}
	
	
	System.out.println("no of numeric"+num);
	System.out.println("the string have"+num+ "numeric");
	
	
	
}
}
