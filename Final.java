class Employee
{
	final int id = 11;
	void change()
	{
		//id = id +10;//cannot change final
		System.out.println("final varible canot be change");
	}
	final void add() {
		System.out.println("addition is possible");
	}
}
final class  company extends Employee{
	//final void add();//cannot override 
	
}
public class Final {
	public static void main(String args[])
	{
		Employee e = new Employee();
		//e.id(1);
		e.change();
		e.add();
		
	}
}
