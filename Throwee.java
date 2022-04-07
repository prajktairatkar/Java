package exception;
class p1 extends Exception{
	//int age = 12;
	p1(String s)
	{
		super(s);
	}
}
public class Throwee {

	public static void main(String[] args) {
		p1 obj = new p1("not eligible");
		int age = 12;
		try
		{
			if(age<19)
			{
				throw obj;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
