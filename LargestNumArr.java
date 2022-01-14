package one;

public class LargestNumArr {
	public static void main(String args[]) {
		int arr[] = {2,3,4,5,6,7};  int max = arr[0];
		for(int i = 0;i < arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(" The largest elements of array is "+max);
	}

}
