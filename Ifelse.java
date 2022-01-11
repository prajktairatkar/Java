package one;
import java.util.*;

public class Ifelse {
	public static void main(String args[]) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age ");
		age = sc.nextInt();
		if(age>= 18)
		{
			System.out.println(age+ " is eligible ");
			
		}
		else {
			System.out.println(age+ " not eligible ");
		}
	}
	

}
