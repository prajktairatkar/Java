package one;

public class AddElement {
	public static void main(String args[]) {
		int arr[] = {10,20,30,40,50,60,70};
		int pos = 4;
		int keyelemet = 100; 
		for( int i = arr.length-1; i > pos - 1;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[pos-1] = keyelemet;
	
		for( int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}
