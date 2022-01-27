
class A{
	private int id;
	public float salary;
	A(int id){
		this.id = id;
		System.out.println("A constructor");
		
	}
}
	class B extends A
	{
		B(int id)
		{
			super(id);
			System.out.println("B constructor");
		}
	}
	class C extends B
	{
		C (int id,float sal)
		{
			super(id);
			salary = sal;
			System.out.println(" c constructor ");
		}
	}

public class Sper {
	public static void main(String args[]) {
		C ob = new C(1,2.32f);
		System.out.println("salary is "+ob.salary);
	}
}
