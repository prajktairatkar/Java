package two;
import java.util.*;
public class AllAreaSwitch {
public static void main(String args[]) {
	int side,length,breadth,base,height,radius,choice;
	int areasq,arearect,areatri; float areacir;
	Scanner sc = new Scanner(System.in);
	System.out.println("1.area of square ");
	System.out.println("2.area of rectangle ");
	System.out.println("3.area of triangle ");
	System.out.println("4. area of circle ");
	System.out.println("Enter your choice ");
	choice = sc.nextInt();
	
	
	
	switch(choice)
	{
	case 1:
	System.out.println("Enter value of side");
	side = sc.nextInt();
	areasq = side * side;
	System.out.println("Area of square is " +areasq);
	break;
	case 2:
		System.out.println("Enter value of length and breadth");
		length = sc.nextInt();
		breadth = sc.nextInt();
		arearect = length * breadth;
		System.out.println("Area of rectangle is " +arearect);
		break;
	case 3:
		System.out.println("Enter value of base and height ");
		base = sc.nextInt();
		height = sc.nextInt();
		areatri = (base) * (height)/2;
		System.out.println("The are of triangle is " +areatri);
		break;
	case 4:
		System.out.println("Enter radius ");
		radius = sc.nextInt();
		areacir = 3.14f * radius * radius;
		System.out.println("The area of circle is " +areacir);
		break;
		default:
			System.out.println("Invalid ");
	}
	
}
}
