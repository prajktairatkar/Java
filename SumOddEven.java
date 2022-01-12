package loop;
import java.util.*;
public class SumOddEven {
	public static void main(String args[]) {
		int i,num;
		int oddsum = 0, evensum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		System.out.println("To find sum of all even and oddd numbers");
		num = sc.nextInt();
		for(i = 1; i <= num; i++)
		{
		if(i%2 ==0)	
		{
			evensum = evensum + i;
		}
			else
			{
				oddsum = oddsum + i;
			}
		}
		System.out.println("evensum is " +evensum);
		System.out.println("oddsum is " +oddsum);
		
		
		}
		
	}


