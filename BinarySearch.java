package one;

public class BinarySearch {
	public static void main(String args[]) {
		int num; int arr[]= {1,2,3,4,5,6};
		 int i, key = 5; int pos =0; 
		int l= 0, h=arr.length-1 ; int mid =0;
		while(l<h)
		{
			mid = (l+h)/2;
			if(key == arr[mid])
			{
				
				pos = mid+1;
				break;
			}
			else if(key < arr[mid])
			{
				h = mid -1;
			}
			else if(key > arr[mid])
			{
				l = mid +1;
			}
		}
		if(pos > 0)
		{
			System.out.println(key+ "found at position"+pos);
		}
		else
		{
			System.out.println(key+"not found"+pos);
		}
	}

}
