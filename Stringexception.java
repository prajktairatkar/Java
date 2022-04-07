package exception;

public class Stringexception {
	public static void main(String args[]) {
		String s = null;
		System.out.println("before length");
		try
		{
			int l = s.length();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		//System.out.println(s.length());
		System.out.println("After length");
	}

}
