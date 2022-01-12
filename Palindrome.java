package loop;

public class Palindrome {
	public static void main(String args[]) {
		int digit,num = 121,reverse = 0, temp =num;
		while(num>0)
		{
			digit = num%10;
			reverse = reverse*10+digit;
			num = num/10;
		}
		System.out.println("The reverse is"  +reverse);
		if(temp == reverse)
		{
			System.out.println("palindrome" +reverse);
		}
		else
		{
			System.out.println("not palindrome" +reverse);
		}
	}

}
