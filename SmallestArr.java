package one;

public class SmallestArr {
	public static void main(String ags[]) {
		int arr[] = {4,6,5,2,1,9};
		int min = arr[0];
		for( int i = 0; i< arr.length; i ++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
				
		}
		System.out.println(" The smallest elements of array is "+min);
	}

}
