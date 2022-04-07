class Table{
	  void print(int n,String str) {
		  synchronized(this) 
		  {
		  for(int i=1;i<=10;i++) 
		  {
			System.out.println("n x"+i+"="+n*i+""+str);
		}
	  }
			for(int i=1;i<=10;i++)
			{
				System.out.println(str+""+i);
			}
	 
		}
}
class FirstThread extends Thread{
	Table t;
	public FirstThread(Table te){
		this.t=te;
	}
	public void run() {
		t.print(5,"Hello");
	}
}

class SecondThread extends Thread{
	Table t;
	public SecondThread(Table te) {
		this.t=te;
	}

	public void run() {
		t.print(10,"Hi");
		
	}
}

public class Synchroniized {

public static void main(String[] args) throws InterruptedException {
			Table te = new Table();//common object
			FirstThread t1 = new FirstThread(te);
			SecondThread t2= new SecondThread(te);
			t1.start();
			
			t2.start();
	
	}

}
