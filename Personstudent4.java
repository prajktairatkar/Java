package oopsjava29jan;
class Person{
	private String name;
	private String address;
	Person(String name,String address)
	{
		this.name = name;
		this.address = address;
		}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		address = address;
	}
	public String toString()
	{
		return "person[Name= "+name+", address= "+address+"]";
	}
}
class Student extends Person
{
	private String program;
	private int year;
	private double fee;
	Student(String name,String address,String program,int year,double fee)
	{
		super(name, address);
		this.year = year;
		this.program = program;
		this.fee = fee;
		
	}
	String getProgram()
	{
		return program;
	}
	void setProgram(String program)
	{
		program = program;
	}
	int getYear()
	{
		return year;
	}
	void setYear(int year)
	{
		year = year;
	}
	double getfee()
	{
		return fee;
	}
	void setfee(double fee)
	{
		fee = fee;
	}
	
	@Override
	public String toString()
	{
		return "Student [program=" + program + ", year=" + year + ", fee=" + fee + ", toString=" + toString() + "]";
	}
}
class Staff extends Person{
private String school;
private double pay;
	Staff(String name, String address,String school,double pay) {
		super(name, address);
		this.school = school;
		this.pay =pay;
		
	}
	String getSchool()
	{
		return school;
	}
	void setSchool(String school)
	{
		school =  school;
	}
	double getPay()
	{
		return pay;
	}
	void setPay()
	{
		pay = pay;
	}
	@Override
	public String toString() {
		return "Staff [school=" + school + ", pay=" + pay + "]";
	}
	
	
}
public class Personstudent4 {

	public static void main(String[] args) {
		Staff obj = new Staff("prajkta","BAMU","IT",2500);
		System.out.println("Staff:"
	            + " Name=" + obj.getName()
	            + " school=" + obj.getSchool()
	            + " address=" + obj.getAddress()
	            + " pay=" + obj.getPay());
	   
		Staff obj1 = new Staff("pranita","BAMUY","ITT",25.00);
		System.out.println("Staff:"
	            + " Name=" + obj1.getName()
	            + " school=" + obj1.getSchool()
	            + " address=" + obj1.getAddress()
	            + " pay=" + obj1.getPay());
	   
	      
	      

	}

}
