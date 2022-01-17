package one;
import java.util.*;
public class Multidime {
	public static void main(String args[]) {
		int arr[][] = new int[4][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 * 3 matrix");
		for(int i = 0;i<4;i++)
		{
			for(int j= 0;j< 3;j++)
			{
				arr[i][j] = sc.nextInt();
				
			}
		}
		//disply
		for(int i =0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
