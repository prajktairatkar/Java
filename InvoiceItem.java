package oopsjava29jan;
class Iv{
	int id;
	String desc;
	int qty;
	double unitprice;
	Iv(int id,String desc,int qty,double unitprice){
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitprice = unitprice;
	}
	int getId()
	{
		return id;
	}
	String getdesc()
	{
		return desc;
	}
	void setquality(int i)
	{
		//return qty;
	}
	void setunitprice(double up)
	{
		
	}
	double getunitprice()
	{
		return unitprice;
	}
	double gettotal(double total)
	{
		return total;
	}
	
}
public class InvoiceItem {

	public static void main(String[] args) {
		Iv obj = new Iv(102,"pen",22,22.33);
		
obj.setquality(2);
obj.setunitprice(33.44);
System.out.println(obj);
System.out.println("id is "+obj.getId());
System.out.println("desc is "+obj.getdesc());
System.out.println("total is "+obj.gettotal(1234));
System.out.println("unitprice is "+obj.getunitprice());
	}

}
