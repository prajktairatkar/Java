package collectionframework;

import java.util.Arrays;

public class Arraysbinary {

	public static void main(String[] args) {
		int arr[] = {1,3,4,7,6,9,8};
		//Arrays.sort(arr);
		int key = 3;
		int result = Arrays.binarySearch(arr, key);
if(result > 0)
{
	System.out.println(key+ "present at position" +result);
}
else
{
System.out.println(key+ "present at position" +result);

}
		
	}

}
