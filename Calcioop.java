package one;
import java.util.*;
class num{
int num1,num2,ans;
void input() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of number");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
}
void add() {
	ans = num1 + num2;
	System.out.println("sum is "+ans);
	
	
}
	
	
void sub() {
	ans = num1 - num2;
	System.out.println("sub is "+ans);
	
	
}
void mul() {
	ans = num1 * num2;
	System.out.println("mul is "+ans);
	
	
}
void div() {
	ans = num1 % num2;
	System.out.println("div is "+ans);
	
	
}
}
public class Calcioop{
	public static void main(String args[]) {
	num n = new num();
	n.input();
	n.add();
	n.sub();
	n.mul();
	n.div();
	}

}

