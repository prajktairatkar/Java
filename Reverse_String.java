package stringedu;

public class Reverse_String {
	public static void main(String args[]) {
		String s = "prajkta"; 
		System.out.println("reverse string");
		for(int i = s.length();i > 0;i--)
		{
			System.out.print(s.charAt(i-1));
		}
		
	}

}
