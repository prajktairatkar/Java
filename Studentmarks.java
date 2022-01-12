package two;
import java.util.*;

public class Studentmarks {
	public static void main(String args[]) {
		String name; float sub_1,sub_2,sub_3,sub_4,sub_5; float avg,total;
		Scanner sc = new Scanner(System.in);
		System.out.println( "Enter your name: ");
		name = sc.nextLine();
		System.out.println(" Enter five subject marks: ");
		sub_1 = sc.nextFloat();
		sub_2 = sc.nextFloat();
		sub_3 = sc.nextFloat();
		sub_4 = sc.nextFloat();
		sub_5 = sc.nextFloat();
		total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
		avg = total/5;
		System.out.println("name: " +name);
		System.out.println(" The average of five subjects are " +avg);
	}

}
