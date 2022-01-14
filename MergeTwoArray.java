package one;
import java.util.*;
public class MergeTwoArray {
	public static void main(String args[]) {
		int arr1[], arr2[], arr3[],length1, length2, length3;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter first array size ");
		length1 = sc.nextInt();
		arr1 = new int[length1];
		System.out.println(" Enter elements of first array ");
		for( int i=0; i< arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println(" Enter second array size ");
		length2 = sc.nextInt();
		arr2 = new int[length2];
		System.out.println(" Enter second array elements ");
		for( int i=0;i<arr2.length;i++)
		{
		arr2[i] = sc.nextInt();
		} 
		length3 =length1 + length2;
		arr3 = new int[length3];
		for(int i = 0;i < length1;i++)
		{
		arr3[i] = arr1[i];
		}
		for( int i=0;i<length2;i++)
        {
           arr3[length1+i]=arr2[i];
         }
		System.out.println(" Array after merging ");
		for( int i = 0;i<length3;i++)
		{
			System.out.println(arr3[i]);
		}
		
}

}
