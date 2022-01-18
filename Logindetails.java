package stringedu;
import java.util.*;
public class Logindetails {
	public static void main(String args[]) {
		String username, password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username ");
		username = sc.nextLine();
		System.out.println("Enter password");
		password = sc.nextLine();
		if(username.equalsIgnoreCase("prajkta") && password.equals("prajkta121"))
		{
			System.out.println("Login sucessful");
		}
		else
		{
			System.out.println("invalid username or password ");
		}
		
	}

}
