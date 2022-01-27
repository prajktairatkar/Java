class Parent
{
	 void display()
	{
		System.out.println("Parent class function");
	}
}
	class Child extends Parent
	{
		  void display()
		{
			//super.display();
			System.out.println("child class ");
		}
	}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* Child ch = new Child();
        ch.display();*/
        //Parent p =new Parent();
       // p.display();
           Parent p = new Child();
            p.display();
	}

}
