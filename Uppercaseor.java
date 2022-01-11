package jan4;
import java.util.*;
public class Uppercaseor {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any alphabet ");
		char Albha;
		Albha = sc.next().charAt(0);
		if(Albha>=65 && Albha <=90)
		{
			System.out.println("Upper case ");
			
		}
		else if(Albha>=97 && Albha<=122)
		{
			System.out.println("lowercase");
		}
	}

}
