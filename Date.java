package oopsjava29jan;
class p1{
int day;
int month;
int year;
p1(int day,int month,int year){
	this.day = day;
	this.month = month;
	this.year = year;
	}
int getday()
{
	return day;
}
int getmonth() {
	return month;
}
int getyear()
{
	return year;
}
void setday(int i)
{
	
}
void setmonth(int i)
{
	
}
void setyear(int i)
{
	
}

void setDate(int day,int month,int year)
{
	
}

public static void move() {
	// TODO Auto-generated method stub
	
}
}
public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
p1 obj = new p1(1,1,2022);
obj.setday(1);
obj.setmonth(01);
obj.setyear(2022);
//obj.toString();
System.out.print(obj.getday()+" /");
System.out.print(obj.getmonth()+ " /");
System.out.print(obj.getyear()+" ");
 
	}

}
