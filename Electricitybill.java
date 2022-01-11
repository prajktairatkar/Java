package jan4;
import java.util.*;

public class Electricitybill {
	public  static void main(String args[]){
		int units;
		float amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter units: ");
		units =sc.nextInt();
		if(units <= 100)
		{
			amount = units * 0.8f;
		}
		else if(units >=100 && units<=300)
		{
			amount = 100 * 0.8f +(units-100)*1;
		}
		else
		{
			amount = 100 * 0.8f + 200*1 +(units-300)*2.50f;
		}
		System.out.println(" The amounts you pay for units " +units+ " is " +amount);
	}

}

