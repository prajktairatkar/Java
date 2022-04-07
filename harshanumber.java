package collectionOne;

public class harshanumber {

	public static void main(String[] args) 
	{
	int n=200;
	int temp=n;
	int sum=0;
	while(n!=0)
	{
		sum=sum+n%10;
		n=n/10;
	}
	if(temp%sum==0)
		System.out.println("harshad number");
	else
		System.out.println("not");

	}

}
