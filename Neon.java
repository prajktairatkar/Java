package loop;
import java.util.*;
public class Neon {
	public static void main(String args[]) {
		int number, temp, remainder = 1, sum = 0; int sq;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter any number");
		number = sc.nextInt();
		sq = number * number;
		while(sq > 0)
		{
			 
			remainder = sq%10;
			sum = sum +remainder;
			
			sq = sq / 10;
		}
		//ystem.out.println("sum of square of digits is " +sum);
	
	if(number == sum)
	{
		System.out.println("neon");
	}
	else
	{
		System.out.println(" not neon");
	}
	}
	

}
