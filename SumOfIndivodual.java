package arrays;

public class SumOfIndivodual {
	public static void main(String args[]) {
		int i,num=234; int reverse = 0;
		 num = 234;
		while(num>0)
		{
		int digit = num%10;
		reverse = reverse*10 +(digit);
		num= num/10;
		}
		System.out.println("Reverse number is "+reverse);
		
	}

}
