package one;
import java.util.*;
public class Sumofdiagonalelements {
	public static void main(String args[]) {
		int a[][];
		int r,c; 
		Scanner sc = new Scanner(System .in );
		System.out.println("Enter no of rows and columns");
		r = sc.nextInt();
		c = sc.nextInt();
		a=new int[r][c];
		if(r!=c)
		{
			System.out.println("Should be square matrix ");
			
		}
		else
		{
			System.out.println("Enter matrix elements ");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println(" matrix");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
				System.out.print(a[i][j]);
				}
				System.out.println();
			}
			int sum =0;
			for(int i=0 ;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					if(i == j)
					{
						sum = sum +a[i][j];
					}
					
				}
				
			}
			System.out.println("sum is" +sum);
			
			
			
		}
		
	}

}
