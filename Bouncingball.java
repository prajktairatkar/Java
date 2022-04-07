package oopsjava29jan;
class balls{
private static	float x; 
private static int radius;
private static 	float y;
private static  float xdelta;
private  static float ydelta;
	balls(float x,float y,int radius,int speed,int direction){
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.xdelta = speed;
		this.ydelta= direction;
		}
	 static float getx()
	{
		return x;
	}
	float gety()
	{
		return y;
	}
	void setx(float x1)
	{
		x = x1;
	}
	void sety(float y1)
	{
		y = y1;
	}
	static int getradius()
	{
		return radius;
	}
	void setradius(int r)
	{
		radius = r;
	}
	float getxdelta()
	{
		return xdelta;
	}
	float getydelta()
	{
		return ydelta;
	}
	void setxdelta(float Xdelta)
	{
		xdelta = Xdelta;
	}
	static void setydelta(float Ydelta)
	{
		ydelta = Ydelta;
	}
	 static void move()
	{
		x = x+xdelta;
		y = y + ydelta;
	}
	static void reflecthorizontal()
	{
		xdelta = -xdelta;
	}
	void reflectvertical()
	{
		ydelta = -ydelta;
	}
	public String toString() {
		return "Ball[("+x+ ","+y+"), speed = "+xdelta+" ,"+ydelta+"]";
	}
}
class container{
	int x1;
	int y1;
	int x2;
	int y2;
	container(int x,int y,int width,int height){
		x1 = x;
		y1 = y;
		x2 = width;
		y2 = height;
	}
	int getx()
	{
		return x1;
		}
	int gety()
	{
		return y1;
		}
	int getwidth()
	{
		return x2;
	}
	int getheight()
	{
		return y2;
	}
		public boolean collidesWith(balls ball) {
		   if (balls.getx() - balls.getradius() <= this.x1 ||
		       balls.getx() -  balls.getradius() >= this.x2) {
		      balls.reflecthorizontal();
			     
			   }
		   return true;
		
		}
}
public class Bouncingball {

	public static void main(String[] args) {
		balls ball = new balls(50,50,5,10,3);
		container box = new container(0,0,100,100);
		System.out.println(ball);
		for (int step = 0; step < 100; ++step) {
			   ball.move();
			   box.collidesWith(ball);
			   System.out.println(ball); // manual check the position of the ball
			}


	}

}
