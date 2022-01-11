package edubridge;
import java.util.*;

public class YEar {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Days: ");
		int day,year,week;
		day = sc.nextInt();
		year = day/365;
		week = day%365/7;
		day = day - ((year*365) + (week));
		
		System.out.println("The year " +year+ " week " +week+ " days " +day );
	}

}
/*y = (d / 365);
w = (d % 365) / 7;
d = d - ((y * 365) + (w));*/

