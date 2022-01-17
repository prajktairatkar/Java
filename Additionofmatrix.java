package one;
import java.util.*;
public class Additionofmatrix {
	public static void main(String args[]) {
	int a[][], b[][],sum[][];
	int r,c,r1,c1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the rows and columns of first matrix ");
	r = sc.nextInt();
	c = sc.nextInt();
	System.out.println("Enter the rows and columns of second matrix ");
	r1 = sc.nextInt();
	c1 = sc.nextInt();
if(r!=r1 && c!=c1 ||  r<0)
{
	System.out.println("Addition is not possible ");
}
else
{
	a=new int[r][c];
	b= new int[r1][c1];
	sum = new int[r][c];
	

//enter matrix
System.out.println("Enter the elements of first matrix ");
for(int i=0;i<r;i++)
{
	for(int j = 0;j<c;j++)
	{
		a[i][j]= sc.nextInt();
	}
}
System.out.println("Enter the elements of second matrix ");
for(int i=0;i<r1;i++)
{
	for(int j = 0;j<c1;j++)
	{
		b[i][j]= sc.nextInt();
	}
}

System.out.println("sum of matrix");
for(int i=0;i<r;i++)
{
	for(int j= 0;j<c;j++)
	{
		sum[i][j] = a[i][j] + b[i][j];
	}
}
//print
for(int i=0;i<r;i++)
{
	for(int j = 0;j<c;j++)
	{
		System.out.print(a[i][j]+ " ");
	}
	System.out.println();
}

for(int i=0;i<r1;i++)
{
	for(int j = 0;j<c1;j++)
	{
		System.out.print(b[i][j]+  " ") ;
	}
	System.out.println();
}
for(int i=0;i<r;i++)
{
	for(int j= 0;j<c;j++)
	{
		System.out.print(sum[i][j]+  " ");
	}
	System.out.println();
}


}
}
}