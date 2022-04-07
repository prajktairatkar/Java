package oopsjava29jan;
class p2{
	float x,y;
	int radius;
	float xdelta, ydelta;
	p2(float x,float y,int radius,float xdelta,float ydelta)
	{
		this.radius = radius;
		this.x = x;
		this.y = y;
		this.xdelta = xdelta;
		this.ydelta = ydelta;
	}
	float getx()
	{
		return x;
		
	}
	float gety() {
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
	int getradius()
	{
		return radius;
	}
	float getxdelta()
	{
		return xdelta;
	}
	float getydelta()
	{
		return ydelta;
	}
	void setxdelta( float x1delta)
	{
		xdelta = x1delta;
	}
	void setydelta( float y1delta)
	{
		ydelta = y1delta;
	}
	void move()
	{
		x = x+xdelta;
		y = y+ydelta;
	}
	void setradius(int ra) {
		radius = ra;
		
	}
	void reflecthorizantal()
	{
		xdelta = -xdelta;
		
	}
	public void reflectVertical() {
		// TODO Auto-generated method stub
		ydelta = -ydelta;
	}
	public String toString()
	{
		return "Ball[("+x+ ","+y+ "speed =" +xdelta+","+ydelta+"]";
	}
	
	 
}
public class Ball {
	public static void main(String args[]) {
		p2 ball = new p2(1.1f, 2.2f, 10, 3.3f, 4.4f);
	      System.out.println(ball);  // toString()

	      // Test Setters and Getters
	      ball.setx(80.0f);
	      ball.sety(35.0f);
	      ball.setradius(5);
	      ball.setxdelta(4.0f);
	      ball.setydelta(6.0f);
	      System.out.println(ball);  // toString()
	      System.out.println("x is: " + ball.getx());
	      System.out.println("y is: " + ball.gety());
	      System.out.println("radius is: " + ball.getradius());
	      System.out.println("xDelta is: " + ball.getxdelta());
	      System.out.println("yDelta is: " + ball.getydelta());

	      // Bounce the ball within the boundary
	      float xMin = 0.0f;
	      float xMax = 100.0f;
	      float yMin = 0.0f;
	      float yMax = 50.0f;
	      for (int i = 0; i < 15; i++) {
	         ball.move();
	         System.out.println(ball);
	         float xNew = ball.getx();
	         float yNew = ball.gety();
	         int radius = ball.getradius();
	         // Check boundary value to bounce back
	         if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
	            ball.reflecthorizantal();
	         }
	         if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
	            ball.reflectVertical();
	         }
	      }

	}

}
