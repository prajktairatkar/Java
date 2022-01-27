package one;
import java.util.*;
class Area{
	void rectangleArea()
	{
		int l,b;
		Scanner sc= new Scanner(System.in);
		System .out.println("Enter the value of length and breadth");
		l = sc.nextInt();
		b = sc.nextInt();
		int rectarea = l * b;
		System.out.println("Area of rectangle is"+rectarea);
		}
	float circleArea(float r) {
		float ans ;
		ans = 3.14f*r*r;
		return ans;
	}
	int squarearea(int side)
	{
		int sqarea = side*side;
		return sqarea;
	}
}
public class Allarea {
	public static void main(String args[]) {
		Area a = new Area();
		a.rectangleArea();
		System.out.println("Area of circle is"+a.circleArea(4));
	    //System.out.println("Area of square is"+a.squarearea(2));
		int sa = a.squarearea(2);
		System.out.println("area of square "+sa);
		
	}

}
