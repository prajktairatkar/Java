package one;
import java.util.*;
public class Identitymatrix {
	public static void main(String args[]) {
		int a[][], id[][];
		int r,c; boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and columns of matrix ");
		r = sc.nextInt();
		c = sc.nextInt();
		a= new int[r][c];
		id = new int[r][c];
		if(r!=c)
		{
			System.out.println("Enter square matrix ");
		}
		else
		{
			
		
		System.out.println("Enter elements of matrix ");
		for(int i = 0;i < r;i++)
		{
			for(int j=0; j< c;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println(" matrix ");
		for(int i = 0;i < r;i++)
		{
			for(int j=0; j< c;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		for(int i =0;i < r;i++)
		{
			for(int j =0;j < c;j++)
			{
				if(i==j && a[i][j]!=1)
				{
					flag = false;
					break;
				}
				if(i!=j && a[i][j]!=0)
				{
					flag = false;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("identity matrix");
	}
		else
		{
			System.out.println("not identity matrix ");
		}
	}
}
}