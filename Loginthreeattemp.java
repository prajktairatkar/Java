package stringedu;
import java.util.*;
public class Loginthreeattemp {
	public static void main(String args[]) {
		String usernm, pass; int count = 0;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter username ");
			usernm = sc .nextLine();
			System.out.println("Enter password");
			pass = sc.nextLine();
			if(usernm.equalsIgnoreCase("prajkta") && pass.equals("prajkta121"))
			{
				System.out.println("Login sucessfull");
				break;
			}
			else
			{
				count++;
			}
		}
		while(count < 3);
		if(count == 3)
		{
			System.out.println("sorry! try again after 24 hrs ");
		}
	}


}
