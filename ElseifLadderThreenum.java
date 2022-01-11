package jan4;
import java.util.*;

public class ElseifLadderThreenum {
	public static void main(String args[]) {
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter any three numbers ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		if(num1 > num2 && num1 > num3)
		{
			System.out.println(num1+ " num one is greater ");
			
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println(num2+ " num2 is greater ");
		}
		else if(num3 > num1 && num3 > num2)
		{
			System.out.println(num3+ " number three is greater ");
		
	}
	else 
	{
	
		System.out.println("All three numbers are equal ");
	}

}
}