package one;
import java.util.*;
public class LinearArray2 {
	public static void main(String args[]) {
		int num, i, arr[],pos=0; int key;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size ");
		num = sc.nextInt();
		arr = new int[num];
		
		System.out.println("Enter array elements ");
		 
		for( i = 0;i < arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the search elements ");
		key = sc.nextInt();
		int l =0;
		int h = num - 1;
		 int mid = 0;
		 while(l < h)
		 {
			 mid =(l + h)/2;
			 if(key == arr[mid])
			 {
				 pos = mid + 1;
				 break;
			 }
			 else if(key< arr[mid])
			 {
				 h = mid + 1;
			 }
			 else if(key>arr[mid])
			 {
				 l = mid - 1;
			 }
		 }
		 if(pos > 0)
		 {
			 System.out.println("found" +pos);
		 }
		 else
		 {
			 System.out.println("not found" +pos);
		 }
	}

}
