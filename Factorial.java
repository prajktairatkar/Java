package loop;
import java.util.*;
public class Factorial {
	public static void main(String args) {
		int i,fact = 1,num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number ");
		num = sc.nextInt();
		for(i= num;i>=1; i--)
		{
			fact = fact *i;
		}
		System.out.println("Factorial of num is" +num+ " is" +fact);
		
		
	}
}


