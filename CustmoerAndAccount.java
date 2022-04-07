package oopsjava29jan;
class Cust
{
	int cid;
	String cname;
	char cgender;
	Cust(int id1,String nm,char gen)
	{
		cid = id1;
		cname = nm;
		cgender = gen;
	}
	int getid(int cid)
	{
		return cid;
	}
	String getname(String cname)
	{
		return cname;
	}
	char getgender(char cgender)
	{
		return cgender;
	}
	
	public String toString()
	{
		return cname+ " ,"+cid+" ";
	}
}
	class p7{
		int id;
		Cust custmoer;
		double balance = 0.0;
		p7(int id,Cust custmoer,double balance)
		{
			this.id = id;
			this.custmoer = custmoer;
			this.balance = balance;
		}
		int getid()
		{
			return id;
		}
		Cust getcustmoer()
		{
			return custmoer;
		}
		double getbalance()
		{
			return balance;
		}
		void setbalance(double bal) {
			balance = bal;
		}
		@Override
		public String toString() {
			return "Account [id=" + id + ", custmoer=" + custmoer + ", balance=" + balance + "]";
		}
		
		double deposit(double amount)
		{
			amount = balance;
			return balance;
			
		}
		double withdraw(double amount)
		{
			
			if(balance>= amount)
			{
			amount = amount - balance;
			}
			else
			{
				
				System.out.println("exceeds");
			}
			return balance;
		}
	
	
}
public class CustmoerAndAccount {
	public static void main(String args[]) {
		Cust obj = new Cust(1,"prajkta",'f');
		System.out.println(obj);
		int idd = obj.getid(5);
		String Name = obj.getname("sanu");
		char Gender=  obj.getgender('f');
		System.out.println("id is = " +idd);
		System.out.println("Name  is =" +Name);
		System.out.println("gender is = " +Gender);
		//System.out.println("id is "+obj.getid());
		p7 ac1 = new p7 (1,obj,22.23);
		System.out.println(ac1);
		ac1.setbalance(12.22);
		System.out.println(ac1);
		ac1.getbalance();
		ac1.getcustmoer();
		double dp = ac1.deposit(12.21);
		System.out.println("deposit is" +dp);
		ac1.withdraw(55.43);
		
		
	}

}
