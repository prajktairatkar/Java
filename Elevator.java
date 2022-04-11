package collectionframework;
import java.util.*;
class MyException extends Exception{
	MyException(String s){
		super(s);
		
	}
}
class Elevator1{
	public static int floor = 1;
	//method for floor selection
	public void selectFloor(int f) {
		try {
			if(f<1 ||f>10) {
			throw new MyException("please selsect a floor between 1 and 10");
			
		}
			if(f>floor) {
				System.out.print("Going up");
				while(floor<f) {
					Thread.sleep(1000);
					System.out.print(".."+ ++floor);
				}
				System.out.print("..Ding!");
			}
			else if(f<floor) {
				System.out.print("Going down");
				while(floor>f) {
					Thread.sleep(1000);
					System.out.print(".."+ --floor);
				}
				System.out.println("..Ding!");
			}
			else {
				System.out.println("You are arrived at your requested floor");
				
			}
			Thread.sleep(1000);
		}
			catch(MyException e) {
				System.out.println(e.getMessage());
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	//method if user pulls elevator's fire alarm
	public void fireAlarm()throws InterruptedException {
		if(floor>1) {
				System.out.println("Going down");
				while(floor>1) {
					Thread.sleep(1000);
					System.out.println(".."+ --floor);
				}
			}
			System.out.println("ding");
			System.out.println("Please exit the building by pressing 'q'");
		
		}
	}
	
	

public class Elevator {

	public static void main(String[] args) {
		Elevator1 e = new Elevator1();//create an  object of super class
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Please select an option ");
			System.out.println("(s)elect a floor,(f)alarm,(q)quit");
		ch = sc.next().charAt(0);
		switch(ch) {
		case 's':
			System.out.println("Enter the floor you would like to go: ");
			int select = sc.nextInt();
			e.selectFloor(select);
			break;
		case 'f':
			System.out.println("Danger! You must exist the building now!");
			break;
		case 'q':
			System.out.println("Moving out...");
			break;
			default:
				System.out.println("Invalid selection");
		}
		}while(ch!='q');
		
sc.close();
	}
}


