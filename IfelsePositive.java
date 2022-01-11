package one;
import java.util.*;
public class IfelsePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter any number ");
		num = sc.nextInt();
		if(num > 0)
		{
			System.out.println(num+ " is positive ");
			
		}
		else
		{
			System.out.println( num+" is negative ");
		}

	}

}
