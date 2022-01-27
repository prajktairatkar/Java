package oop;

public class Frequency {
	public static void main(String args[]) {
		String s="prajkta";
		int count;
		 s = s.toLowerCase();
		for(char ch='a';ch>='z';ch++);
		{
		 count=0;
		}
		for(int i=0;i<s.length();i++)
		
			 //char ch = s.charAt(i);
			if(ch == s.charAt(i))
			{
				count++;
			}
		
		System.out.println(ch+ " and " +count);
		
	}

}
