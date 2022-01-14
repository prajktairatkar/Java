package loop;
import java.util.*;
public class PrimenumberNested {
	public static void main(String args[]) {
		int  i,j,count =0; int sv,endv;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting value");
		sv = sc.nextInt();
		System.out.println(" Enter ending value");
		endv = sc.nextInt();
		
		for(i = 1;i<=100;i++) {
		count = 0;
		
			for(j= 1;j<=i;j++) {
				if(i % j==0)
				{
					count++;
				}
			}
			if(count == 2)
				
				
			System.out.print(i+ " ");
		}
	}

}
