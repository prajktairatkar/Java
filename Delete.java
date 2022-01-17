package one;
import java.util.*;
public class Delete {
	public static void main(String args[]) {
		int arr[], num; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size ");
		num = sc.nextInt();
		arr= new int[num];
		System.out.println("Enter array elements ");
		for(int  i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the elemnents to be deleted ");
		 int keyelement = sc.nextInt();
		 for(int i= 0;i<arr.length;i++)
			{
				if(keyelement==arr[i])
				{
					for(int j=i;j<arr.length-1;j++)
					{
						arr[j] = arr[j+1];
					}
					break;
				}
			}
			System.out.println("After deleting");
			for(int i=0;i<arr.length-1;i++)
			{
				System.out.println(arr[i]);
			}
			 
	}

}
