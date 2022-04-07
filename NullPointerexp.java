package exception;

public class NullPointerexp {
	public static void main(String args[]) {
		String s = null;
		try
		{
			int length = s.length();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		System.out.println("After");
	}
	

}
