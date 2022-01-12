package two;
import java.util.*;
public class Switchoddeven {
	public static void main(String args[]) {
		int num;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter any number ");
		num = sc.nextInt();
		switch (num%2)
		{
		case 1:
			System.out.println("number is odd " );
			break;
		case 0:
			System.out.println("number is even ");
			
		}
	}
	
	

}
