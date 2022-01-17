package one;
import java.util.*;
public class Multiplication {
	public static void main(String args[]) {
		int a[][], b[][],mul[][];
		int r,c,r1,c1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the rows &col of first matrix");
		r = sc.nextInt();
		c = sc.nextInt();
		a= new int[r][c];
		System.out.println("Enter the rows and columns of second matrix");
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		b = new int[r1][c1];
		mul = new int[r][c];
		System.out.println("Enter first matrix ");
		for(int i =0;i<r;i++)
		{
			for(int j = 0;j < c;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter second matrix ");
		
			for(int i =0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					b[i][j] = sc.nextInt();
				}
			}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				
				mul[i][j] = 0;
				for(int k=0;k<r;k++)
				{
					mul[i][j] = a[i][k] * b[k][j];
				}
			}
		}
		System.out.println("First matrix");
		for(int i =0;i<r;i++)
		{
			for(int j = 0;j < c;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("second matrix");
		for(int i =0;i<r1;i++)
		{
			for(int j = 0;j < c1;j++)
			{
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("multiplication of matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				
				mul[i][j] = 0;
				for(int k=0;k<r;k++)
				{
					System.out.print(mul[i][j]+ " ");
				}
			}
			System.out.println();
		}
	}

}
