package oopsjava29jan;
class Timee{
	int hour;
	int sec;
	int min;
	Timee(int hr,int mint,int seco)
	{
		hour = hr;
		min = mint;
		sec = seco;
	}
	int gethour()
	{
		return hour;
	}
	int getmin()
	{
		return min;
	}
	int getsce()
	{
		return sec;
	}
	void sethour(int newhr)
	{
		hour = newhr;
	}
	void setmin(int newmin)
	{
		min = newmin;
	}
	void setsec(int newsec)
	{
		sec = newsec;
	}
	void settime(int hr1,int min1,int sec1)
	{
		hour = hr1;
		min = min1;
		sec = sec1;
	}
	public String toString()
	{
		return hour+ ":"+min+" :"+sec;
	}
}
public class Time {
	public static void main(String args[]) {
		Timee obj = new Timee(1, 20, 34);
		System.out.println(obj);
		obj.sethour(5);
		obj.setmin(12);
		obj.setsec(30);
		 
		System.out.println(obj);//to string
		System.out.println("hour "+obj.gethour());
		System.out.println("minute "+obj.getmin());
		System.out.println("second "+obj.getsce());
		//System.out.println("Time is "+obj.settime());
		obj.settime(10, 5, 12);
		System.out.println(obj);
		
	}

}
