package one;
import java.util.*;
public class Merge4Array {
	public static void main(String args[]) {
		int arr1[], arr2[],arr3[], arr4[];
		int l1,l2,l3,l4;
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter size of first array ");
		l1 = sc.nextInt();
		arr1 = new int[l1];
		//arr4 = new int[l4];
		System.out.println(" Enter elements of first array ");
		for( int i=0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println(" Enter size of second array ");
		l2 = sc.nextInt();
		arr2 = new int[l2];
		System.out.println(" Enter elements of second array ");
		for( int i=0;i<arr2.length;i++)
		{
			arr2[i] = sc.nextInt();
		}
		System.out.println(" Enter size of third array");
		l3 = sc.nextInt();
		arr3 = new int[l3];
		System.out.println(" Enter elements of third array ");
		for(int i = 0;i < arr3.length;i++)
		{
			arr3[i] = sc.nextInt();
		}
		l4 = l1+l2+l3;
		//l4 = sc.nextInt();
		arr4 = new int[l4];
		for( int i= 0;i<l1;i++)
		{
			arr4[i] = arr1[i];
		}
		for( int i=0;i<l2;i++)
		{
			arr4[l1 + i] = arr2[i];
		}
		for(int i=0;i<l3;i++)
		{
			arr4[l1+l2+i] = arr3[i];
		}
		System.out.println(" After merging three arrays ");
		for(int i =0; i<l4;i++)
		{
			
			System.out.println(arr4[ i ]);
		}
		
		
		
		
	}

}
