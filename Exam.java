package exception;

import java.util.Scanner;

class InvalidException extends RuntimeException{
	InvalidException(String str)
	{
		super(str);
	}
	
}
public class Exam {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee first name ");
		String fname = sc.nextLine();
		System.out.println("enter employee middle  name ");
		String mname = sc.nextLine();
		System.out.println("enter employee last  name ");
		String lname = sc.nextLine();
		
		if(fname =="" && lname=="" )
		{
			
			throw new InvalidException("name should not be blank ");
		
			}
		else
			{
				System.out.println("valid");
			}
			
		
		
	}

}

