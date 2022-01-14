package arrays;

public class Primenumber {
	public static void main(String args[]) {
		int i, num =8, count = 0;
		for(i = 1; i<= num; i++)
		{
			if(num%i == 0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}

}
