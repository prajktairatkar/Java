package oopsjava29jan;

class Ciircle{
	float length,breadth;
	Ciircle(float l,float b)
	{
		length = l;
		breadth = b;
	}
	public void setLength()
	{
		
	}
	public void setbreadth()
	{
		
	}
	public float getarearect()
	{
		return length * breadth;
	}
	public float getperimeter()
	{
		return 2 *length *breadth;
	}
}


public class Rect1 {
	public static void main(String args[]) {
		Ciircle obj = new Ciircle(1.2f,1.2f);
		//System.out.println(obj);
		obj.setLength();
		obj.setbreadth();
		System.out.println("length is "+obj.length);
		System.out.println("breadth is "+obj.breadth);
		float ar = obj.getarearect();
		System.out.println("area of rectangle is "+ar);
		float arp = obj.getperimeter();
		System.out.println("perimeter of rectangle is "+arp);
		 
	}

}
