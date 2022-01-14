package loop;
import java.util.*;
public class Reverse1 {

	public static void main(String[] args) {
		int i,num,digit,reverse = 0;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		temp = num;
		while(num > 0)
		{
			digit = num % 10;
			reverse = reverse * 10+ digit;
			num = num /10;
		}
System.out.println("Reverse number is " +reverse);
if(reverse == temp)
{
	System.out.println("number is palindrome " +temp);
}
else {
	System.out.println("number is not palindrome " +temp);
}
	}
	

}
