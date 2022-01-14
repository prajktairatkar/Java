package loop;
import java.util.*;
public class Factwhile {
	public static void main(String args[]) {
		int num, i, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		num = sc.nextInt();
		i = num;
		while(i >=1)
		{
			fact = fact *i;
			i--;
		}
		System.out.println("Factorial of number is" +num+ " is " +fact);
		
	}

}
