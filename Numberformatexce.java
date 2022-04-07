package exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Numberformatexce {
	public static void main(String args[])
	{
		int i ;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter age");
		try
		{
			i = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
