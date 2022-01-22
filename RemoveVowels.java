package one;

public class RemoveVowels {
	public static void main(String args[]) {
		String s = "welcome to java";
		String re = "";
		for(int i =0;i< s.length();i++)
		{
			char ch = s.charAt(i);
			if(!(ch=='a'||ch=='e' ||ch=='i'|| ch=='o'|| ch=='u'||ch=='A'|| ch=='E'
					||ch=='O'||ch=='U' ||ch=='I'))
			{
				re = re+ch;
			}
				
		}
		System.out.print(re);
	}

}
