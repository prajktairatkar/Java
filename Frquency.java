package one;

public class Frquency {
	public static void main(String args[]) {
		int arr[]  = {1,2,3,4,5,6,2,1,3,34,4,3,8,9,10,9};
		int visited = -1;
		int frq[] = new int[arr.length];
		for(int i= 0;i<arr.length;i++)
		{
			int count =1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{	
				count++;
				frq[j] = visited;
				}
			}
			if(frq[i]!=visited)
			{
				frq[i] = count;
			}
		}
		System.out.println("----------------");
		System.out.println("Elemnnts | frequency ");
		for(int i=0;i<frq.length;i++)
		{
			if(frq[i]!=visited)
			{
				System.out.println(arr[i]+ "  "+frq[i]);
			}
		}
		
		
	}

}
