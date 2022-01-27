class enc{
	private int balance =3456;
	private String password;


public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
}
public class Encapsulation {
	public static void main(String args[]) {
		enc obj =new enc();
		//obj.getbalance();
		System.out.println("balance is "+ obj.getBalance());
		//System.out.println("balance is "+ obj.setBalance());
	}

}
