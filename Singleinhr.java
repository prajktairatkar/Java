class single
{
	single(){
	System.out.println(" parent single inheritance ");
	}
}
class Single1 extends single{
	Single1()
	{
		System.out.println("child class ");
	}
}
public class Singleinhr extends single{

	public static void main(String[] args) {
		
		Single1 ob = new Single1();
	
		
		
	}

}
