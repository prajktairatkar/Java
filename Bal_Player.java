package oopsjava29jan;
class Ball45{
	private float x;
	private float y;
	private float z;
	Ball45(float x,float y,float z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	float  getx()
	{
		return x;
	}
	float  gety()
	{
		return y;
	}
	float  getz()
	{
		return z;
	}
	void setxyz(float x,float y,float z)
	{
		
	}
	public String toString()
	{
		return "("+x+ ","+y+","+z+")";
	}

}
class pl
{
	 int number;
	 float x;
	 float y;
	 float z = 0.0f;
	 pl(int number,float x,float y){
		 this. x = x;
		 this. y =y;
	 }
	 void move(float zdisp)
	 {
		 
	 }
	 void jump(float zdisp)
	 {
		 
	 }
	 boolean near(balls ball)
	 {
		 if(number<8)
		 {
			 
		 }
		 return true;
	 }
}
public class Bal_Player {
	public void main(String args[]) {
		Ball45 obj = new Ball45(1.2f,2.2f,3.3f);
		pl pl1 = new pl(5,2.4f,5.5f);
		System.out.println(obj);
pl1.jump(1);
pl1.jump(2);
System.out.println(pl1);
}
}
