package oopsjava29jan;
class Custmoer{
	int cid;
	String cname;
	int cdiscount;
	Custmoer(int id1,String nm,int ds)
	{
		cid = id1;
		cname = nm;
		cdiscount = ds ;
	}
	int getid()
	{
		return cid;
	}
	int getdiscount()
	{
		return cdiscount;
	}
	String getname()
	{
		return cname;
	}
	void setdiscount(int Disc)
	{
		cdiscount = Disc;
	}
	int getcustmoerid()
	{
		return cid;
	}
	String getcustmoername()
	{
		return cname;
	}
	int getcustmoerdiscount()
	{
		return cdiscount;
	}
	double  amountafterdiscount()
	{
		return cdiscount;
	}
	public String toString()
	{
		return "name["+cname+" ,"+cid+","+cdiscount+"]";
	}
	
}
class invoice{
	int id;
	Custmoer custmoer;
	double amount;
	invoice(int idd,Custmoer cu,int ds1,double am){
		id = idd;
		custmoer = cu;
		amount = am;
		
	}
	double getamount()
	{
		return amount;
	}
	int getid()
	{
		return id;
	}
	Custmoer getcustmoer()
	{
		return custmoer;
	}
	void setid(int id2)
	{
		id = id2;
	}
	void setcustmoer(Custmoer cs) {
		custmoer = cs;
	}
	void setamount(double am)
	{
		amount = am;
	}
	@Override
	public String toString() {
		return "invoice [id=" + id + ", custmoer=" + custmoer + ", amount=" + amount + "]";
	}
	public String getCustomerName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class CustmoerandInvoice {
public static void main(String args[]) {
    Custmoer c1 = new Custmoer(88, "Tan Ah Teck", 10);
    System.out.println(c1);  // Customer's toString()

    c1.setdiscount(8);
    System.out.println(c1);
    System.out.println("id is: " + c1.getid());
    System.out.println("name is: " + c1.getname());
    System.out.println("discount is: " + c1.getcustmoerdiscount());

    // Test Invoice class
    invoice inv1 = new invoice(101, c1, 12,888.8);
    System.out.println(inv1);

    inv1.setamount(999.9);
    System.out.println(inv1);
    System.out.println("id is: " + inv1.getid());
    System.out.println("customer is: " + inv1.getcustmoer());  // Customer's toString()
    System.out.println("amount is: " + inv1.getamount());
    System.out.println("customer's id is: " + c1.getcustmoerdiscount());
    System.out.println("customer's name is: " + c1.getcustmoername());
    System.out.println("customer's discount is: " + inv1.getCustomerName());
    //System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());

}
}
