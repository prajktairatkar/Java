package jan4;
import java.util.*;

public class ElseIfLadeer {
	public static void main(String args[]) {
	int num1 ,num2;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter any two number ");
	num1 = sc.nextInt();
	num2 = sc. nextInt();
	if(num1 >num2)
	{ 
		System.out.println(num1+ " first is greater ");
		
	}
	else if(num2 > num1)
	{
		System.out.println(num2+ " second is greater ");
	}
	else
	{
		System.out.println(" Both are equal ");
	}
	
	}

}
