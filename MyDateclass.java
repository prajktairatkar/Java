package oopsjava29jan;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

class p8
{
	private int year;
	private int month;
	private int day;
	
	String months[] = {"jan","feb","march","april","may","june","july","aug","sep","oct","nov","dec"};
 String days[] = {"sun","mon","tue","wed","thu","fri","sat"};
 int daysinmonth[] = {31,28,31,30,31,31,30,31,30,31};
	boolean isleapyear(int year)
	{
		if(year%4==0)
		{
			System.out.println("is leap year");
		}
		return true;
		}
	boolean isvaliddate(int year ,int month,int day)
	{
		if(year>=1 && year <=1998 || month>=1 && month <=12 ||day>=1 && day<=7)
		{
			System.out.println("valid dat");
		}
		return true;
	}
	int getValue()
	{
		return day;
		
	}
	/*int getdaysofweek(int years,int month,int days)
	{
		LocalDate localDate = LocalDate.of(1947,months."aug",15);
		
	}*/
	int getyear()
	{
		return year;
	}
	int getmonth()
	{
		return month;
		
	}
	int getday() {
		return day;
	}
	void setyear(int year1)
	{
		year = year1;
	}
	void setmonth(int month1)
	{
		month = month1;
	}
	void setdays(int day1)
	{
		day = day1;
	}
	public String toString()
	{
		return +day+ ":"+month+":"+year;
	}
}
public class MyDateclass {
	public static void main(String args[]) {
		p8 obj = new p8();
		obj.isleapyear(2004);
		obj.isvaliddate(2, 4, 2007);
		obj.setyear(1997);
		obj.setmonth(9);
		obj.setdays(11);
		System.out.println(obj);
		
		System.out.println("year is:" +obj.getyear());
		System.out.println("month is: "+obj.getmonth());
		System.out.println("day is: "+obj.getday());
	
	}

}
