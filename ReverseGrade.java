
package jan4;
import java.util.*;

public class ReverseGrade {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char grade;
		System.out.println("Enter any grade ");
		grade = sc.next().charAt(0);
		if(grade== 'A' || grade=='a')
		{
			System.out.println("Student scored between 90 to 100 ");
		}
		else if(grade == 'B' || grade== 'b')
		{
			System.out.println(" Student scored between 80 to 60 ");
		}
		else if(grade == 'C'  || grade== 'c')
		{
			System.out.println("scord between 40 to 30 ");
		}
		else if(grade == 'D' || grade== 'd')
		{
			System.out.println(" scored between 30 to 0 ");
		}
		else
		{
			System.out.println(" invalid ");
		}
	}

}
