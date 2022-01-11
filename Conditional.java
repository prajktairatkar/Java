package one;
import java.util.*;
public class Conditional {
	public static void main(String args[] ) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		num = sc.nextInt();
		if(num > 0) {
		System.out.println(num+ "is positive");
	}
		if(num < 0)
		{
			System.out.println(num+ "is negative");
			
		}
		if(num == 0)
		{
			System.out.println(num+ " is neutra");
			
		}
			

}
}