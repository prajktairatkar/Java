package stringedu;
import java.util.*;
public class Login_Attempt {
	public static void main(String args[]) {
		String s ;
		String pass  ; int count=0;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter username");
			s= sc.nextLine();
			System.out.println("Enter password ");
			pass = sc.nextLine();
			
			if(s.equalsIgnoreCase("prajkta") && pass.equals("prajkta121"))
			{
				System.out.println("Login sucessful");
				break;
			}
			else
			{
				count++;
			}
		}
		while(count<3);
		
		if(count == 3)
		{
			System.out.println(" sorry! Login after 24 hrs");
		}
		
	}

}
