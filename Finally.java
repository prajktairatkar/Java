package exception;

public class Finally {
	public static void main(String args[])
	{
		int a = 12;
		int deno = 23;
		int ans;
		try
		{
			ans = a/deno;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally block");
		}
	}
}
