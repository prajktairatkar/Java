package one;
class Addition{
	
	void add(int i,int j)
	{
		int addi = i+j;
		System.out.println(" normal Addition is "+addi);
	}
	void add(float i,float j)
	{
	float	addi = i+j;
		System.out.println(" Float Addition is "+addi);
	}

	void add(double i,double j)
	{
		double addi = i+j;
		System.out.println("Addition is "+addi);
	}
	void add(short i,short j)
	{
		    short addi = (short)(i+j);
		System.out.println(" short Addition is "+addi);
	}
	void add(byte i,byte j)
	{
		byte addi = (byte)(i+j);
		System.out.println(" Byte Addition is "+addi);
	}
}
public class CalciOverload {
	public static void main(String args[]) {
		Addition ad = new Addition();
		ad.add(2, 2);
		ad.add(1.2f, 1.2f);
		ad.add(22.2, 12.2);
		ad.add((short )1,(short)3) ;
		ad.add((byte)0, (byte)1);
	}

}
