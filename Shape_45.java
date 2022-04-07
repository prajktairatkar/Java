package oopsjava29jan;
class Shape10
{
	private String color;
	private boolean filled ;
	Shape10(){
		color = "red";
		filled = true;
	}
	Shape10(String color,boolean filled){
		color = "green";
		filled = true;
	}
	String getColor()
	{
		return color;
	}
	void setColor(String color)
	{
		color = color;
	}
	boolean isfilled()
	{
		return filled;
	}
	
	@Override
	public String toString() {
		return "Shape10 [color=" + color + ", filled=" + filled + "]";
	}
}
	
	class Rectangl10 extends Shape10{
		private double width;
		private double length;
		Rectangl10()
		{
			width = 1.0;
			length = 1.0;
		}
		
		Rectangl10(double width,double length)
		{
			this.width=width;
			this.length = length;
		}
		Rectangl10(double width,double length,String color,boolean filled)
		{
			super(color,filled);
				this.width = width;
				this.length = length;
				
			}
		double getWidth()
		{
			return width;
		}
		void setWidth(double width)
		{
			width = width;
		}
		double getLength()
		{
			return length;
		}
		void setLength(double length)
		{
			length = length;
		}
		double getArea()
		{
			double rectarea = length * width;
			return rectarea;
		}
		double getPerimetre()
		{
			double rectperi = 2*(length + width);
			return rectperi;
			
		}

		@Override
		public String toString() {
			return "Rectangl10 [width=" + width + ", length=" + length + ", getColor()=" + getColor() + ", isfilled()="
					+ isfilled() + ", toString()=" + super.toString() +  "]";
		}
	}
	class Square10 extends Rectangl10{
		
		Square10(){
			
		}
Square10(double side)
{
		super(side,side);	
		}

double getSide()
{
	return this.getSide();
}
void setSide(double side) {
	side = side;
}
void setLengt(double side)
{
	super.setLength(side);;
}
void setWidth(double side)
{
	super.setWidth(side);
}
@Override
double getArea() {
	// TODO Auto-generated method stub
	return super.getArea();
}
@Override
double getPerimetre() {
	// TODO Auto-generated method stub
	return super.getPerimetre();
}
@Override
public String toString() {
	return "Square10 [getWidth()=" + getWidth() + ", getLength()=" + getLength() + ", toString()=" + super.toString()
			+ ", getColor()=" + getColor() + ", isfilled()=" + isfilled() +  "]";
}

	}
public class Shape_45 {
	public static void main(String args[])
	{
		Square10 obj =new Square10();
		System.out.println("square:"
	            + " length=" + obj.getLength()
	            + " width=" + obj.getWidth()
	            + " color=" + obj.getColor()
	            + " filled=" + obj.isfilled()
	            + " area=" + obj.getArea()
	            + " perimeter=" + obj.getPerimetre());
	   
	      // Declare and allocate a new instance of cylinder
	      //   specifying height, with default color and radius
		Square10 obj1 =new Square10(5.2);
		System.out.println("square:"
	            + " length=" + obj1.getLength()
	            + " width=" + obj1.getWidth()
	            + " color=" + obj1.getColor()
	            + " filled=" + obj1.isfilled()
	            + " area=" + obj1.getArea()
	            + " perimeter=" + obj1.getPerimetre());
		System.out.println(obj1);
	   
	}

}
