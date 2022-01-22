package stringedu;
import java.util.*;
public class Palindrome {
	public static void main(String args[]) {
		String s, rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		s = sc.nextLine();
	
		for(int i=s.length();i>0;i--)
		{
			rev=rev+(s.charAt(i-1));
		}
		if(s.equals(rev))
		{
			System.out.println("string is palindrome "+rev);
		}
		else
		{
			System.out.println("string is not palindrome "+rev);
		}
	}
	

}
