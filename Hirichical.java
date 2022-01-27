class h1
{
	h1(){
		System.out.println("parent class ");
	}
}
class h2 extends h1
{
	
	h2()
	{
		
		System.out.println("child1 ");
		
	}
}
class h3 extends h1
{
	
	h3()
	{
	
		System.out.println("child 2 ");
	}
}
public class Hirichical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
h3 ob =new h3();
h2 ob1 = new h2();
//h1 ob2 = new h1();
	}

}
