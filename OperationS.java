package two;
import java.util.*;
public class OperationS {
	public static void main(String args[]) {
		int choice;
		float a, b,ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add");
		System.out.println("1.sub");
		System.out.println("1.mul");
		System.out.println("1.div");
		System.out.println("Enter your choice ");
		choice = sc.nextInt();
		System.out.println("Enter any two ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		
		
		switch(choice)
		{
		case 1:
			ans = a + b;
			System.out.println("Addition of two number is " +ans);
			break;
		case 2:
			float sub = a - b;
			System.out.println("substraction is "+sub);
		break;
		case 3:
			float mul = a * b;
			System.out.println("substraction is "+mul);
			break;
		case 4:
			float div = a /b;
			System.out.println("substraction is "+div);
			break;
		default:
			System.out.println("Invalid " );
			
				
		}	
			
			
		}
	}


