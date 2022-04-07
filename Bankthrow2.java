package exception;
class Bankk extends Exception{
	Bankk(String s)
	{
		super(s);
	}
}
public class Bankthrow2 {
	public static void main(String args[]) {
		Bankk ob = new Bankk("Your balance is low");
		int balance =3000;
		int amount = 32000;
		try
		{
			if(amount>balance)
			{
				throw ob;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
