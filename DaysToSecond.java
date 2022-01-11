package one;
import java.util.*;

public class DaysToSecond {
	public static void main(String args[]) {
		int day,second;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of days: ");
		day = sc.nextInt();
		second = day * 24* 60 *60;
		System.out.println("the day " +day+ " sec is " +second);
		
	}

}
