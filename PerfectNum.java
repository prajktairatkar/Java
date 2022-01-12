package loop;
import java.util.*;
public class PerfectNum {

	public static void main(String[] args) {
		int num,i,temp, sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		num = sc.nextInt();
		 temp = num;
		for(i = 1; i<num;i++)
		{
			if(num % i ==0)
			{
				sum = sum + i;
			}
		}
		//System.out.println("The sum of factors is " +sum);
		
		if(sum == temp)
		{
			System.out.println( temp+ " given number is perfect number ");
		}
		else
		{
			System.out.println( "not perfect"+temp);
		}

	}

}
