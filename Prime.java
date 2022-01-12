package loop;
import java.util.*;
public class Prime {
	public static void main(String ags[]) {
		int num,i; int count = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number");
		num = sc.nextInt();
		for( i=1; i<num; i++ )
		{
			if(num %1==0) {
			 count = count+1;
		}
			if(count == 2 )
			{
				System.out.println(num+ " is prime ");
				
			}
			else
			{ 
				System.out.println(num+ "not prime");
			}
	}

}
}
