package two;
import java.util.*;
public class Course {
	public static void main(String args[]) {
		String cname;
		Scanner sc = new Scanner(System.in);
		System.out.println("--------*------");
		System.out.println("java");
		System.out.println("python");
		System.out.println("sql");
		System.out.println("oracle");
		System.out.println("Enter course name ");
		cname = sc.nextLine();
		switch(cname)
		{
		case "java":
			System.out.println("your course is java ");
			break;
		case "python":
			System.out.println(" ypur course is python ");
			break;
		case "sql":
			System.out.println(" your course is sql");
			break;
		case "oracle":
			System.out.println("your course is oracle");
			break;
			default:
				System.out.println(" Invalid input ");
		}
	}

}
