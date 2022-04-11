package collectionframework;
import java.util.*;
class Employees{
	String name;
	int empid;
	double salary;
	String dept;
	public Employees(String name, int empid, double salary, String dept) {
		super();
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		this.dept = dept;
	}
	
}
public class Emloyeecustom {

	public static void main(String[] args) {
		Employees ob = new Employees("pra",1,2345,"IT");
		Employees ob2 = new Employees("prakta",2,2545,"cs");
		Employees ob3 = new Employees("praj",3,2745,"civil");
		ArrayList<Employees> a12 = new ArrayList<>();
		a12.add(ob);
		a12.add(ob2);
		a12.add(ob3);
		System.out.println("Name\tID\tsalary\tdept");
		Iterator<Employees> it = a12.iterator();
		while(it.hasNext())
		{
			Employees object = it.next();
			System.out.print(object.name+"\t");
			System.out.print(object.empid+"\t");
			System.out.print(object.salary+"\t");
			System.out.print(object.dept+"\t");
			System.out.println();
		}
		

	}

}
