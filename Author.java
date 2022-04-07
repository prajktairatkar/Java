package oopsjava29jan;
class Book{
	String name;
	String email;
	char gender ;
	Book(String nm,String mail,char gen){
		name = nm;
		email = mail;
		gender = gen;
	}
	String getname()
	{
		return name;
	
	}
	String getemail()
	{
		return email;
	
	}
	char getgender()
	{
		return gender;
	}
	void setname(String nm1)
	{
		name =nm1;
	}
	void setemail(String email1)
	{
		email =email1;
	}
	void setgender(char f) {
		gender = f;
		//gender = m;
	}
	public String  toString() {
		return "Author[ "+name+ " "+email+" "+gender+"]";
	}
	
}
public class Author {

	public static void main(String[] args) {
		Book b1 = new Book("prajkta","prajkta@gmail.com",'f');
System.out.println(b1);
b1.setname("praju");
b1.setemail("pra@gmail.com");
b1.setgender('f');
//b1.setgender('m');
System.out.println("name is "+b1.getname());
System.out.println("email is"+b1.getemail());
System.out.println("Gender is "+b1.getgender());
System.out.println(b1);
	}

}
