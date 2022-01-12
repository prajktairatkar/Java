package loop;
import java.util.*;
public class Armstrong {
	public static void main(String args[]) {
	//int num = 153;
	int number,digit, temp,remainder = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	number = sc.nextInt();
	temp = number;
	while(number > 0)
	{
		digit = number %10;
		remainder = remainder+digit*digit*digit;
		number = number /10;
	}
if(remainder == temp)
{
	System.out.println(temp+ "armstrong");
}
else
{
	System.out.println(temp+ " not armstrong");
	}
}
}
