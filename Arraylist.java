package collectionOne;

public class Arraylist {
	 int index=0;
	 int size=5;
	 int [] a=new int[size];
	public  Arraylist() {
		
	}
	public Arraylist(int size) {
		a=new int[size];
		
	}
	 void add(int num)
	{
		if(index>=a.length)
		{
			int size=(int)(a.length*1.75);
			int[] b= new int[size];
			for (int i = 0; i < a.length; i++) 
			{
			b[i]=a[i];	
			}
			a=b;
		}
		a[index++]=num;
		//index++;
		
	}
      void print()
      
	{
		for (int i = 0; i < index; i++) 
		{
		System.out.print(a[i]+" ");	
		}
	}
	}


