class Table11{
	synchronized  void print(int n) {
		   
		  for(int i=1;i<=10;i++) {
			System.out.println("n x"+i+"="+n*i);
		}
	  }
}
/*class FirstThread extends Thread{
	Table t;
	public FirstThread(Table te){
		this.t=te;
	}
	public void run() {
		t.print(5,"Hello");
	}
}*/
public class Ananymous {

	public static void main(String[] args) {
		Table11 obj = new Table11();
		Thread t1 = new Thread() {//anonymous class
			public void run() {
				obj.print(2);
			}
		};
		t1.start();
		
new Thread()//anonymous class and object
{
	public void run() {
	obj.print(3);
}
	
}.start();
	}

}
