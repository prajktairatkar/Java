package one;
class copy{
	int i,j;
	copy(int i,int j)
	{
		this.i= i;
		this.j=j;
		System.out.println(+this.i);
		System.out.println(+this.j);
		
	}

 copy(copy obj) {
	    
	 System.out.println("copy constructor ");
 }
}
class Copyconst {
	public static void main(String args[]) {
		copy ob = new copy(1,2);
		copy ob1 = new copy(ob);
		
	}
	

}
