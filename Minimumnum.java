package one;

import java.util.Scanner;

public class Minimumnum {
	public static void main(String args[]) {
		int a, b, c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter theree numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = (a<b  && a<c)?a:c;
		System.out.println(" The smallest number is " +d);
	}

}
