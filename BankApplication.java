package one;
import java.util.Scanner;
class BankDetails{
	private String acc_no;
	private String acc_type;
	private String acc_name;
	private long balance;
	Scanner sc  = new Scanner(System.in);
	public void createAccount()
	{
		System.out.println("Enter account number ");
		acc_no = sc.next();
		System.out.println("Enter account type ");
		acc_type = sc.next();
		System.out.println("Enter account holder name ");
		acc_name = sc.next();
		System.out.println("Enter account balance ");
		balance = sc.nextLong();
	}
		public void showAccount() 
		{
			System.out.println("Name of account holder: " +acc_name);
			System.out.println("Account no : " +acc_no);
			System.out.println("Account type : " +acc_type);
			System.out.println("Balance : " +balance);
		}
		public void deposite()
		{
			long amt;
			System.out.println("Enter the amount you want to deposita ");
			amt = sc.nextLong();
			balance = balance + amt;
			System.out.println("Your amt deposited sucessfully " +balance);
		}
		public void withdraw()
		{
			long amt;
			System.out.println("Enter the amount you want to withdraw ");
			amt = sc.nextLong();
			if(balance >= amt)
			{
				balance = balance - amt;
				System.out.println("Amount withraw sucessfully "+balance);
			}
			else
			{
				System.out.println("Your balance is low than "+amt+ "\t transaction failed");
			}
		}
		public boolean search(String ac_no)
		{
			if(acc_no.equals(ac_no)) {
				showAccount();
				return true;
			}
			return false;
		}
	}

public class BankApplication {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter how many no.of accounts you want to create? ");
		int num = sc.nextInt();
		BankDetails bd[] = new BankDetails[num];
		for(int i=0;i < bd.length;i++) {
			bd[i] = new BankDetails();
			bd[i].createAccount();
		}
			int ch;
			
			do {
				System.out.println("1. Display account details\n 2. Search by account number\n 3. Deposite the ammount\n 4. Withraw the ammount\n 5. Exit ");
				System.out.println("Enter your choice ");
				ch = sc.nextInt();
				switch(ch)
				{
				case 1: for(int i=0; i<bd.length;i++)
				{
					bd[i].showAccount();
				}
					break;
					case 2:
					System.out.println("Enter the account no you want to search ");
					String ac_no = sc.next();
					boolean found = false;
					for(int i =0;i<bd.length;i++)
					{
						found = bd[i].search(ac_no);
						if(found)
						{
							
							break;
						}
					}
						if(! found)
						{
							System.out.println("Serach failed! account doesnot exit...!");
						}
						break;
					
					case 3:System.out.println("Enter account number : ");
					ac_no = sc.next();
					 found = false;
					 for(int i = 0;i<bd.length;i++)
					 {
						 found = bd[i].search(ac_no);
						 if(found)
						 {
							 bd[i].deposite();
							 break;
						 }
					 }
						 if(!found)
						 {
							 System.out.println("Serach failed! account doesnot exit...!"); 
						 }
					 break;
					case 4:
						System.out.println("Enter account number ");
						ac_no = sc.next();
						found = false;
						for(int i =0;i<bd.length;i++) 
						{
							found = bd[i].equals(ac_no);
							if(found)
							{
								bd[i].withdraw();
								break;
							}
						}
						if(!found)
						{
							System.out.println("Serach failed! account doesnot exit...!");
						}
						break;
					case 5: System.out.println(" Thank you !! ");
					
				
				}
			
		}while(ch!= 5);
		
	}

}
