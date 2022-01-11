package one;
import java.util.*;

public class Age {
	public static void main(String args[]) {
		int Age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ");
		Age = sc.nextInt();
		if( Age>= 18)
		{
			System.out.println(Age+ "is eligible");
			
		}
		if(Age < 18)
		{
			System.out.println(Age+ " is not eligible ");
			
		}
		
	}

}
