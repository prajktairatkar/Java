class test extends Thread
{
	public void run()
	{
		System.out.println("1 task"+Thread.currentThread());
		//System.out.println("2 task"+Thread.currentThread());
	}
}
class test1 extends Thread
{
	public void run()
	{
		System.out.println("2 task"+Thread.currentThread());
	}
}
public class Extends_Thread {
	public static void main(String args[]) {
		test t =new test();
		t.start();
		test1 t1 =new test1();
		t1.start();
	}

}
