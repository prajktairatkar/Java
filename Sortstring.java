package one;

public class Sortstring {
public static void main(String args[]) {
String s[]= {"Rohit", "Devesh", "Indrani", "Shivangi", "Himanshu", "Rishi", "Piyush", "Deepak", "Abhishek", 
					"Kunal"};
for(int i=0;i<s.length-1;i++)
{
	for(int j=0;j<s.length-1-i;j++)
	{
		if(s[j].compareToIgnoreCase(s[j+1])>0)
		{
			String temp = s[j];
			s[j] = s[j+1];
			s[j+1] = temp;
		}
	}
}
			System.out.println("After sorting");
			for(int i=0;i<s.length;i++)
			{
				System.out.print(s[i]+ " ");
			}

			

	}


}
