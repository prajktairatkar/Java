import java.util.*;
public class Userinput {
	public static void main(String args[]) {
		String name; int age; float fees; double loan;char gen;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter age ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println(" Enter your name ");
		name = sc.next();
		System.out.println(" Enter fees ");
		fees = sc.nextFloat();
		System.out.println(" Enter loan ");
		loan = sc.nextDouble();
		System.out.println("Enter gender m/f ");
		gen = sc.next().charAt(0);
		System.out.println("name : " +name);
		System.out.println("age: " +age);
		System.out.println("fees: " +fees);
		System.out.println("loan: " +loan);
		System.out.println("gender: " +gen);
		
		
	
	}

}
