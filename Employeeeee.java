package oopsjava29jan;
class Emp{
	int id;
	String fname;
	String lname;
	int salary;
	int AnnualSalary;
	Emp(int id,String fname,String lname,int salary)
	{
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}
	int  id()
	{
		return id;
	}
	String getfname()
	{
		return fname;
	}
	String getlname()
	{
		return lname;
	}
	int getsalary()
	{
		return salary;
	}
	int getAnnualSalary(int i)
	{
		return AnnualSalary;
	}
}
public class Employeeeee {
	public static void main(String args[]) {
		Emp e1 = new Emp(8,"prajkta","iratkar",250000);
		//e1.setSalary(999);
	      System.out.println("employee id is " +e1.id+ " fname "+e1.fname+ " "+e1.lname+ " "+e1.salary);  // toString();
	      System.out.println("id is: " + e1.id());
	      System.out.println("firstname is: " + e1.getfname());
	      System.out.println("lastname is: " + e1.getlname());
	      System.out.println("salary is: " + e1.getsalary());

	      int as = e1.getAnnualSalary(777);
	      System.out.println("annual salary is: " + as); // Test method

	      
	      System.out.println(e1);
	   
	

	}

}
