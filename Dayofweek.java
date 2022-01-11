package jan4;
import java.util.*;
public class Dayofweek {

	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num;
		num = sc.nextInt();
		if(num ==1)
		{
			System.out.println("sunday");
		}
		else if(num==2)
		{
			System.out.println("Monday ");
		}
		else if(num==3)
		{
			System.out.println("Tuesday");
		}
		else if(num==4) {
			System.out.println("wednesday");
		}
		else if(num == 5) {
			System.out.println("thu");
		}
		else if(num == 6){
			System.out.println("sat");
		}
		else
		{
			System.out.println("invalid ");
		}
		}

	}


