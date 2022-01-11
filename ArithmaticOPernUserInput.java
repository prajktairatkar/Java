package one;
import java.util.*;
public class ArithmaticOPernUserInput {
public static void main(String args[]) {
	int a,b, sum, sub, mul, div,mod;
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter two numbers ");
	a = sc.nextInt();
	b = sc.nextInt();
	sum = a + b;
	System.out.println("The addition : " +sum);
	sub = a - b;
	System.out.println("The substraction: " +sub);
	mul = a * b;
	System.out.println("The multiplication is:" +mul);
	div = a / b;
	System.out.println("The division is: " +div );
	mod = a%b;
	System.out.println("The mod is: " +mod);
	
	
}
}
