class Parent
{
	 String display()
	{
		String str = "parent";
		return str;
	}
}
	class Child extends Parent
	{
		  String display()
		{
			  String str = "child";
				return str;
		}
	}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Child ch = new Child();
       System.out.println( ch.display());
       // Parent p =new Parent();
      //String  p1 = p.display();
      //System.out.println(p.display());
           Parent p = new Child();
            p.display();
	}

}
