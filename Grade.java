package jan4;
import java.util.*;

public class Grade {
	public static void main(String args[]) {
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter marks ");
		marks = sc.nextInt();
		if(marks >= 90 && marks <=100)
		{
			System.out.println(" Grade A ");
		}
			else if(marks >= 60 && marks >= 89)
			{
				System.out.println("Grade b ");
			}
			else if(marks >=40 && marks <=59)
			{
				System.out.println(" Grade c ");
			}
			else if(marks >= 0 && marks <=39)
			{
				System.out.println(" Grage d ");
			}
			else
			{
				System.out.println(" Invalid input ");
		}
	}

}
