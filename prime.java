package oop;

public class prime {
	public static void main(String args[]) {
		int start = 150;
		int end = 200;
		int count;
		for(int i=start;i<end;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i % j==0)
				{
					count++;
				}
			}
			if(count == 2)
				System.out.print(i+" ");
		}
	}

}
