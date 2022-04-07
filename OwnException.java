package exception;

import java.util.Scanner;
class mybank{
	void withdraw()
	{
		System.out.println("withdraw");
	}
	void deposite()
	{
		System.out.println("deposite");
	}
}

public class OwnException {

	 public static void main(String[] args) {
      mybank ob = new mybank();
		Scanner sc = new Scanner(System.in)	;
		System.out.println("Enter your choice ");
int choice = 0;
char ch;
ch = sc.next().charAt(0);
do
{
	System.out.println("menu");
	System.out.println("enter your choice");
	System.out.println("1. deposite");
	System.out.println("2.withdraw");
	System.out.println("3.balance");
	//System.out.println("4.exit");
	
	switch(ch)
	{
	case 1:
		ob.deposite();
		break;
	case 2:
		ob.withdraw();
	}
	

    System.out.println("do you want to exit y/n");
}while(choice =='y');

}
}

