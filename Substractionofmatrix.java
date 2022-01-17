package one;
import java.util.*;
public class Substractionofmatrix {
	public static void main(String args[]) {
		int a[][], b[][], sub[][];
		int r,c,r1,c1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows and columns of first matrix");
		r = sc.nextInt();
		c = sc.nextInt();
		a= new int[r][c];
		System.out.println("Enter the no of rows and columns of second matrix ");
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		b= new int[r1][c1];
		sub= new int[r][c];
		System.out.println("Enter the elements of first matrix ");
		for(int i =0;i<r;i++)
		{
			for(int j =0;j<c;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of second matrix ");
		for(int i= 0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				b[i][j]= sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sub[i][j] = a[i][j] - b[i][j];
			}
		}
		//print
		System.out.println("first matrix");
		for(int i =0;i<r;i++)
		{
			for(int j =0;j<c;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("second matrix ");
		for(int i= 0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("substraction of matrix ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(sub[i][j]);
			}
			System.out.println();
		}
		
	}

}
