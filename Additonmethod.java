package oop;
import java.util.*;
public class Additonmethod {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x and y ");
		 int x = sc.nextInt();
		 int y = sc.nextInt();
		 int sum = sum(x,y);
		 System.out.println("sum is"+sum);
	}
		 static int sum(int a,int b)
			{
				int sum = a+b;
				return sum;
			}

	}


