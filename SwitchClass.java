package two;
import java.util.*;
public class SwitchClass {
	public static void main(String args[]) {
		int day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of days ");
		day = sc.nextInt();
		switch(day)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("wednesday ");
			break;
		case 4:
			System.out.println("Thursday ");
			break;
		case 5:
			System.out.println("friday ");
			break;
		case 6:
			System.out.println("saturday ");
			break;
		default:
			System.out.println("Invalid");
			
			
		
		}
		
		
	}
	

}
