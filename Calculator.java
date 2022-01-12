package two;
import java.util.*;
public class Calculator {
public static void main(String args[]) {
	int num1, num2;
	Scanner sc = new Scanner(System.in);
	System.out.println(" 1.add ,2.sub, 3.mul, 4.div");
	System.out.println("Enter your operation to be performed");
	int a =sc.nextInt();
	System.out.println("Enter two number");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	switch(a)
	{
	case 1:
		a = num2+ num2;
		System.out.println("add" +a);
		break;
	case 2:
		a = num1 -num2;
		System.out.println("sub" +a);
		break;
	case 3:
		a = num1 * num2;
		System.out.println("mul" +a);
	case 4:
		a = num1 /num2;
		System.out.println("div" +a);
		break;
		default:
			System.out.println("invalid input ");
	
		
	}
}
}
