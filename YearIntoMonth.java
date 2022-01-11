package one;
import java.util.*;

public class YearIntoMonth {
	public static void main(String args[]) {
		int year,month,days,minute,second;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Year ");
		year = sc.nextInt();
		month = 12 * year;
		days = 365 * year;
		minute = days * 24 * 60 ;
		second = minute * 60;
		System.out.println("The months are :" +month);
		System.out.println("The days are :" +days);
		System.out.println("The minutes are :" +minute);
		System.out.println("The seconds in one year are :" +second);
		
		
		
	}

}
