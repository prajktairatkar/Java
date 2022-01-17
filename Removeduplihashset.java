package one;

import java.util.HashSet;

public class Removeduplihashset {
public static void main(String args[]) {
	int arr[] = {2,1,3,5,2,6,7,8,5};
	HashSet<Integer> hs = new HashSet<Integer>();
	for(int i = 0;i<arr.length;i++)
	{
		hs.add(arr[i]);
	}
	for(int i:hs)
	{
		System.out.println(i+ "");
	}
	
}
}
