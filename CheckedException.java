package exception;
import java.io.*;
public class CheckedException {
	public static void main(String args[]) {
	int i;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter age");
	
	try
	{
		i = Integer.parseInt(br.readLine());
	}
	catch(NumberFormatException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace(); 
	}
	}
}



