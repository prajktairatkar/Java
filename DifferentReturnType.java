package one;
class sub{
	
	int add(int i,int j)
	{
		int addi = i+j;
		System.out.println(" normal Addition is "+addi);
		return i+j;
	}
	float add(float i,float j)
	{
	float	addi = i+j;
		System.out.println(" Float Addition is "+addi);
		return i+j;
	}

	double add(double i,double j)
	{
		double addi = i+j;
		//return addi;
		//System.out.println("Addition is "+addi);
		return addi;
	
	}
}
public class DifferentReturnType {
	public static void main(String args[]) {
		sub ad = new sub();
		ad.add(2, 2);
		ad.add(1.2f, 1.2f);
		ad.add(22.2, 12.2);
		System.out.println("The addition od double is "+ad.add(22.2,11.2));
	}
	}
