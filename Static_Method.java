class parents
{
	int id;
	static String cname="Microsoft";
	public static void display() {
		System.out.println("static method acess only static data"+cname);
	}
	void non_static_method()
	{
		System.out.println("both static and non static"+id+ ""+cname);
	}
}
public class Static_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parents ob = new parents();
ob.display();
parents.display();
/*Child ch = new Child();
ch.display();*/
	}

}
