package one;

 public class Protectedacess {
	protected void m1()
	{
		System.out.println("Protected method ");
	}
	//class b extends Protectedacess{
		
	
	public static void main(String args[]) {
		Protectedacess ob = new Protectedacess();
		ob.m1();
		
	}

}
