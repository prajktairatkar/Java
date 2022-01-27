package one;

public class Blocks {
	static int n;
	static
	{
		n = 10;
		System.out.println("static block ");
	}
	{
		n=7;
		System.out.println("Ananoymous block ");
	}
	
	 Blocks()
	 {
		 System.out.println("constructor block ");
	 }
	
public static void main(String args[]) {
	System.out.println("main method ");
	Blocks b = new Blocks();
	System.out.println(b.n);
	
	
	
}
}
