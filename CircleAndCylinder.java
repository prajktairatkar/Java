package oopsjava29jan;
 class Circle
{
	private double  radius = 1.0;
	private String color = "red";
	Circle()
	{
		
	}
	Circle(double radius)
	{
		this.radius = radius;
	}
	Circle(double radius,String color)
	{
		this.color =  color;
	}
	{
		this.radius = radius;
	}
	double getRadius()
	{
		return radius;
	}
	 void setRadius(double r)
	 {
		 radius = r;
	 }
	 String getColor()
		{
			return color;
		}
		 void setRadius(String c)
		 {
			 color = c;
		 }
		 Double getArea()
		 {
			 Double area = Math.PI*radius*radius;
					 
			return area;
			 
		 }
		 public String toString()
		 {
			return "Circle[radius=" +radius+", color= "+color+"]";
			 
		 }
}
  class Cylinder extends Circle {  // Save as "Cylinder.java"
	   private double height;  // private variable
	   
	   // Constructor with default color, radius and height
	   public Cylinder() {
	      super();        // call superclass no-arg constructor Circle()
	      height = 1.0; 
	   }
	   // Constructor with default radius, color but given height
	   public Cylinder(double height) {
	      super();        // call superclass no-arg constructor Circle()
	      this.height = height;
	   }
	   // Constructor with default color, but given radius, height
	   public Cylinder(double radius, double height) {
	      super(radius);  // call superclass constructor Circle(r)
	      this.height = height;
	   }
	   
	   // A public method for retrieving the height
	   public double getHeight() {
	      return height; 
	   }
	  
	   // A public method for computing the volume of cylinder
	   //  use superclass method getArea() to get the base area
	   public double getVolume() {
	      return getArea()*height; 
	   }
	}

public class CircleAndCylinder {

	public static void main(String[] args) {
	      Cylinder c1 = new Cylinder();
	      System.out.println("Cylinder:"
	            + " radius=" + c1.getRadius()
	            + " height=" + c1.getHeight()
	            + " base area=" + c1.getArea()
	            + " volume=" + c1.getVolume());
	   
	      // Declare and allocate a new instance of cylinder
	      //   specifying height, with default color and radius
	      Cylinder c2 = new Cylinder(10.0);
	      System.out.println("Cylinder:"
	            + " radius=" + c2.getRadius()
	            + " height=" + c2.getHeight()
	            + " base area=" + c2.getArea()
	            + " volume=" + c2.getVolume());
	   
	      // Declare and allocate a new instance of cylinder
	      //   specifying radius and height, with default color
	      Cylinder c3 = new Cylinder(2.0, 10.0);
	      System.out.println("Cylinder:"
	            + " radius=" + c3.getRadius()
	            + " height=" + c3.getHeight()
	            + " base area=" + c3.getArea()
	            + " volume=" + c3.getVolume());


	}

}
