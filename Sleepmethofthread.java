class T1 extends Thread{
	public void run()
	{
		for(int i = 1;i <=10;i++)
		{
			int num = 2;
			int table = i*num;
			System.out.println("run method"+Thread.currentThread()+"table="+table);
		try {
			Thread.sleep(1000);
			
			  } catch (InterruptedException e) { // TODO Auto-generated catch block
			  e.printStackTrace(); }
			 
		}
	}
}
public class Sleepmethofthread {
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("main thred"+Thread.currentThread());
		
		T1 ob = new T1();
		T1 ob1 = new T1();
		ob.setName("first thread");
		ob1.setName("second name");
		ob.start();
		ob.join();
		ob1.start();
		
	}
}
