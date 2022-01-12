package loop;

public class SumOf50 {
	public static void main(String args[]) {
		int i;
		i = 1;
		int sum = 0;
		while(i <= 50)
		{ 
			sum = sum+i;
			i++;
		}
		System.out.println("Sum of 50 number is " +sum);
		
	}

}
