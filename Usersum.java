package loop;
import java.util.*;
public class Usersum {
	public static void main(String args[]) {
		int i = 1, n,sum = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("input value of n");
		while(i <= n)
		{
			sum = sum + i;
			i++;
			
		}
		System.out.println("Sum of 1 to n "+n+ " is " +sum);
	}

}
