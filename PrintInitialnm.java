package stringedu;
import java.util.*;
public class PrintInitialnm {
	public static void main(String args[]) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		s = sc.nextLine();
		s.toUpperCase();
		for(int i=0;i<s.length();i++)
		{
			if(i == 0)
			{
				System.out.print(s.charAt(i)+ " . ");
			}
			else if(s.charAt(i) == ' ')
			{
				System.out.print(s.charAt(i+1)+ " . ");
			}
		}
	}

}
