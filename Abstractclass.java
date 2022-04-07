package abstractprogramme;
abstract class Animal2
{
	 void sleep() {
	System.out.println("zzzz");
	
	 }
	 abstract void eat();
	
		
	
}
	class cow extends Animal2
	{
		void eat() {//abstract class method
		System.out.println("Grass");
	}
	void features()//cow class method
	{
		System.out.println("cow class method");
	}
}
public class Abstractclass {
	public static void main(String args[]) {
		//Animal2 =new Animal2();abstract class canot instanited
		//Animal2 ob = new cow();
		cow ob = new cow();
		ob.eat();
		ob.features();
		ob.sleep();
		
	}
}


