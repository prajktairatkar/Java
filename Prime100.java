package loop;

public class Prime100 {
public static void main(String args[]) {
	int i,j, count = 0;
	System.out.println("1 to 100");
for(i = 2;i<100;i++)
{
	for(j=1;j<i;j++) {
		if(i%j==0)
		{
		count = count+1;	
		}
		if(count == 2)
		{
			System.out.println(" " +i);
		}
}
}

}
}
