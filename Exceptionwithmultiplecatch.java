package exception;

public class Exceptionwithmultiplecatch {

	public static void main(String[] args) {
		int a =2;
		int b = 0;
		int ans = 0;
		int a1[] = new int[5] ;
		System.out.println("Before execuation");
		try
		{
			a1[4]=5;
			ans = a/b;
			
			
		}
		//catch(ArithmeticException |IndexOutOfBoundsException  e)
		//{
			//e.printStackTrace();
		//}
	/*	try {
			a1[5]=5;
		}
		catch(IndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}*/
		finally
		{
			System.out.println("Finally block ");
		}
		
		System.out.println("After exception ");

	}

}
