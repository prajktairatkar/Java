package one;

public class BubbleSorting {
public static void main(String args[])
{
	int arr[] = {2,6,4,3,8,10,12,11};
	int i,j;
	int temp;
	for(i = 0;i < arr.length - 1;i++)
	{
		for(j = 0;j<arr.length-i-1;j++)
		{
			if(arr[j] > arr[j+1])
			{
				temp = arr[j];
				arr[j]=arr[j + 1];
				arr[j + 1] =temp;
			}
		}
		
	}
	System.out.println("after sorting");
	for(i= 0;i<arr.length;i++)
	
	System.out.println(arr[i]);
	
	
}
}
