package one;

public class Selectionsort {
	public static void main (String args[]) {
		int arr[] = {2,5,4,3,6,22,11,44,22,1,7,8,10};
		int min; int i; int j;
		for(i=0;i<arr.length;i++)
		{
			min = i;
			for(j=i+1;j<arr.length;j++)
			{
	
			if(arr[j]<arr[min]) {
				min = j;
			}
			}
			
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			
		}
		System.out.println("After sorting ");
		for(i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
