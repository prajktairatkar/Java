package oop;
import java.util.Scanner;
class PRAJKTA{
	String name;
	int id;
	float salary;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name and id  and salary ");
		name = sc.nextLine();
		id = sc.nextInt();
		salary = sc.nextFloat();
		
	}
	void display()
	{
		System.out.println("name"+name);
		System.out.println("id"+id);
		System.out.println("salary"+salary);
	}
	 void hsalary(PRAJKTA p[], int n) {
		 float max =0;int maxsal = 0;
		 for(int i =0 ;i<n;i++)
		 {
			 if(p[i].salary>max)
			 {
				 max = p[i].salary;
				 maxsal = i;
			 }
		 }
		p[maxsal].display();
		 
	 }
}
public class Highsal1 {
	public static void main(String args[], Object n) {
		PRAJKTA p[] = new PRAJKTA[2];
		for(int i =0;i<p.length;i++)
		{
			p[i] = new PRAJKTA();
			p[i].input();
			p[i].display();
		}
		//int k = hsal(p, n);
	}

	
	
	

}
