package one;
class Poly{
	void display()
	{
		System.out.println("no argument");
	}
	void display(int i)
	{
		System.out.println("one argument");
	}
	void display(int i, int j)
	{
		System.out.println("two argument");
	}
	void display(float f)
	{
		System.out.println("one float argument");
	}
	void display(float f, int i)
	{
		System.out.println("one float one integer argument");
	}
}
public class FunctionOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly p = new Poly();
		p.display();
		p.display(2);
		p.display(2, 4);
		p.display(2.4f);
		p.display(2.4f, 2);

	}

}
