package one;
import java.util.*;
public class Transposeof {
	public static void main(String args[]) {
		int a[][];
		int trans[][];
		int row,col;
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter no of rows and col of matrix ");
			row = sc.nextInt();
			col = sc.nextInt();
			a = new int[row][col];
			trans = new int[row][col];
			System.out.println("Enter elements of matrix ");
			for(int i=0;i<row;i++)
			{
				for(int j =0;j<col;j++)
				{
					a[i][j] = sc.nextInt();
					//a[i][j] = trans[i][j];
				}
			}
			for(int i= 0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					 trans[j][i] = a[i][j];
				}
			}
			//print
			System.out.println("original matrix");
			
				for(int i =0;i<row;i++)
				{
					for(int j = 0;j<col;j++)
					{
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
			System.out.println("After transpose" );
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(trans[i][j]+" ");
				}
				System.out.println();
			}
		
	}

}
