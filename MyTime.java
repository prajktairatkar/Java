package oopsjava29jan;
class t1{
	int hour = 0;
	int minute = 0;
	int second = 0;
	t1()
	{
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	t1(int hour,int minute,int second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	int gethour()
	{
		return hour;
	}
	int getsecond()
	{
		return second;
	}
	int getminute()
	{
		return minute;
	}
	void sethour(int h)
	{
		hour = h;
	}
	void setminute(int m)
	{
		minute = m;
	}
	void setsecond(int s)
	{
		second = s;
	}
	public String toString()
	{
		return hour+ ":"+minute+ ":"+second+ "";
	}
	void  settime(int ho,int min1,int sec1)
	{
		hour = ho;
		minute = min1;
		second = sec1;
	}
	MyTime previoussecond()
	{
		return null;
		
	}
	MyTime previousminute()
	{
		return null;
		
	}
	MyTime previoushour()
	{
		return null;
		
	}
	MyTime nexthour(int nh)
	{
		hour = nh;
		return null;
		
	}
	MyTime nextminute(int nm)
	{
		minute = nm;
		return null;
		
	}
	MyTime nextssecond(int ns)
	{
		second = ns;
		return null;
		
	}
}
public class MyTime {
	public static void main(String args[]) {
		t1 obj = new t1(1,22,34);
		System.out.println(obj);
		obj.sethour(2);
		obj.setminute(55);
		obj.setsecond(60);
		System.out.println(obj);
		obj.settime(11, 2, 55);
		System.out.println(obj);
		System.out.println("hour is "+obj.gethour());
		System.out.println("minute is "+obj.getminute());
		System.out.println("second is "+obj.getsecond());
		System.out.println(obj.nexthour(00));
		System.out.println(obj.nextminute(00));
		System.out.println(obj.nextssecond(00));
		System.out.println(obj);
	}
}
