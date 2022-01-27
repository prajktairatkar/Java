package one;
class Myconst{
	int i, j,k;
	//consructor
	Myconst(){
		System.out.println("inside constructo");
	i=3;
	j=5;
	System.out.println("i= "+i+"j= "+j);
	
	}
	 Myconst(int i,int j){
	
		this.i=i;
		this.j=j;
	}
	 Myconst(int i,int j,int k){
			
			this.i=i;
			this.j=j;
			this.k= k;
		}
	void largestnum() {
		int l=(i>j)?i:j;
		System.out.println("largest number"+l);
	}
	void largestthree() {
		 int l = (i>j && i>k)?i:k;
		 System.out.println("largest of three number is "+l);
	}
}
public class Constructor {
	public static void main(String args[]) {
Myconst ob = new Myconst();
Myconst ob1 = new Myconst(1,2);
Myconst ob2 = new Myconst(1,2,3);
ob1.largestnum();
ob2.largestthree();
}
}
