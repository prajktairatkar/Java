package abstractprogramme;
//Java program to illustrate the
//concept of Abstraction
abstract class Shape {
	String color;

	// these are abstract methods
	abstract double area();
	public abstract String toString();

	// abstract class can have the constructor
	public Shape(String color)
	{
		System.out.println("Shape constructor called");
		this.color = color;
	}

	// this is a concrete method
	public String getColor() { 
		return color; 
		}
}
class Circle extends Shape {
	double radius;

	public Circle(String color, double radius)
	{

		// calling Shape constructor
		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;
	}

	@Override double area()
	{
		return Math.PI * Math.pow(radius, 2);
	}

	@Override 
	public String toString()
	{
		return "Circle color is " + super.getColor()
			+ "and area is : " + area();
	}
}
class Rectangle extends Shape {

	double length;
	double width;

	public Rectangle(String color, double length,
					double width)
	{
		// calling Shape constructor
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}

	@Override
	double area() { 
		return length * width; 
		}

	@Override 
	public String toString()
	{
		return "Rectangle color is " + super.getColor()
			+ " and area is : " + area();
	}
}
class square extends Shape
{
int side;
	public square(String color,int side) {
		super(color);
		// TODO Auto-generated constructor stub
		this.side = side;
		//this.width = width;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return side *side;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "square color is " + super.getColor()
		+ " and area is : " + area();

	}
	
}
public class AbstractTestAreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle("Red", 2.2);
		Shape s2 = new Rectangle("Yellow", 2, 4);
		Shape s3 = new square("blue", 2);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}

}
