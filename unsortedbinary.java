package one;

public class unsortedbinary {
	public static void main(String args[]) {
		int a[] = {2,3,5,4,17,6,9,810,12,11};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int l =0, h = a.length-1; int mid = 0; int key =3; int pos =0;
		while(l <= h)
		{
			mid = (l + h)/2;
			if(key ==a[mid])
			{
				pos = mid + 1;
				break;
			}
			else if(key < a[mid])
			{
				h = mid - 1;
			}
			else if(key > a[mid])
			{
				l = mid + 1;
			}
			
		}
		if(pos > 0)
		{
			System.out.println(key+"found at"+pos);
		}
		else
		{
			System.out.println(key+"not found"+pos);
		}
	}

}
