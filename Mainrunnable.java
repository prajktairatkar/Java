class Mythred1 implements Runnable{
	
	Mythred1(String name)
	{
		//super(name);
	}

	@Override
	public void run() {
		
		System.out.println("run method"+Thread.currentThread());
	
	}
	
}
public class Mainrunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythred1 obj = new Mythred1 ("first thred");
		
		Thread t1 = new Thread(obj);
		
		
		t1.start();
		Mythred1 obj1 = new Mythred1 ("second thread");
		Thread t2 = new Thread(obj1);
		//t2.setName("second thread");
		t2.start();
	}

}
