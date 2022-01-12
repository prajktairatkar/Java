package loop;
import java.util.*;
public class ReverseF {
	public static void main(String args[]) {
		int num,digit , reverse = 0; 
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		num = sc.nextInt();
		//num1 = sc.nextInt();
		while(num > 0)
		{
			digit = num%10;
			//System.out.println(digit);
			reverse = reverse * 10 + digit;
			num = num/10;
		}
		System.out.println("Reverse number is" +reverse);
		
		 int num1 = num;
	if(num1 == reverse)
	{ 
		
		System.out.println( " not palindrome " +num1);
		
	}
	else
	{
		System.out.println(" palindrome" +num1);
	}

}
}
