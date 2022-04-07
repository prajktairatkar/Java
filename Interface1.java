package abstractprogramme;
interface Miinterface{
	int i=0;//public static final;
	void m1();//budefault it is public ans abstract
	void m2();
	}
interface Anotherinterface extends Miinterface
{
	void m4();
}

class B implements Anotherinterface
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("m4 method");
	}
	
}
class A implements Miinterface
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method");
	}
	
}
public class Interface1 {
	public static void main(String args[]) {
		A obj = new A();
		obj.m1();
		obj.m2();
		B  obj1 = new B();
		obj1.m4();
	}

}
