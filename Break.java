package loop;

public class Break {
	public static void main(String args[]) {
		int i;
		for(i = 1;i<=10; i++)
		{
			if(i%2==0)
			{
				break;
			}
			else {
			System.out.println(i);
			}
		}
	}

}
