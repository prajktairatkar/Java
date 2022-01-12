package loop;
import java.util.*;
public class SumOddFor {
	public static void main(String args[]) {
		int i,num, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of number ");
		num = sc.nextInt();
		for(i= 1;i<=num; i= i+2)
		{
			sum = sum + i;
			
		}
		System.out.println("The sum of odd number "+num+ " is "+sum);
	}

}
