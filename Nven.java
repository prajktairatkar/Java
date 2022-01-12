package loop;
import java.util.*;
public class Nven {
	public static void main(String args[]) {
		int num, i,  sum = 0; int temp; int digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		num = sc.nextInt();
		
		temp = num;
		for( i = 1; i<=num; i++)
		{
			digit = num % 10;
			sum = sum  + i;
			num = num / 10;
		
				
		}
		//System.out.println("Sum of number is " +sum);
		if(temp % sum ==0)
		{
			System.out.println("nivean " +temp);
		}
		else {
			System.out.println("not nivean" +temp);
		}
	}
}
