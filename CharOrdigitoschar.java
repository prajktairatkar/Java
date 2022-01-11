package jan4;
import java.util.*;
public class CharOrdigitoschar {
	public static void main(String args[]) {
		char data;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter data");
		data = sc.next().charAt(0);
		if((data>=65 && data<=90)||(data>=97 && data <122))
		{
			System.out.println("alphabet ");
		}
		else if(data>=48 && data<=57)
		{
			System.out.println("digits");
		
		}
		else
			System.out.println("special character");
	}

}
