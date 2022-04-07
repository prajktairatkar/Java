package oopsjava29jan;

import java.util.Arrays;
class Ppt {
	private float x = 0.0f ;
	private float y = 0.0f;
	Ppt()
	{
		x = 0.0f ;
	    y = 0.0f;
	}
	Ppt(float x,float y)
	{
		this.x = x;
		this.y = y;
	}
	public float getX()
	{
		return x;
	}
	void setX(float x)
	{
		x = x;
	}
	void setY(float y)
	{
		y = y;
	}
	void setXY(float x,float y)
	{
		x =x;
		y =y;
		
	}
	float[] getXY()
	{
		float[] obj = {'x','y'};
		return obj;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
class MovablePoint extends Ppt{
	private float xspeed;
	private float yspeed;
	MovablePoint(float x,float y,float xspeed,float yspeed)
	{
		super(x,y);
		this.xspeed = xspeed;
		this.yspeed = yspeed;
		
	}
	MovablePoint()
	{
		xspeed = 0.0f;
		yspeed = 0.0f;
	}
	MovablePoint(float xspeed,float yspeed)
	{
		
		this.xspeed = xspeed;
		this.yspeed = yspeed;
		
	}
	float getXspeed()
	{
		return xspeed;
	}
	void setXspeed(float xspeed)
	{
		this.xspeed = xspeed;
	}
	float getYspeed()
	{
		return yspeed;
	}
	void setYspeed(float xspeed)
	{
		this.yspeed = yspeed;
	}
	void setSpeed(float xspped,float yspeed)
	{
		xspeed = xspeed;
		yspeed = yspeed;
	}
	float[] getSpeed()
	{
		float[] result = {xspeed,yspeed};
		return result;
		
	}
	public String toString() {
		return "MovablePoint [xspeed=" + xspeed + ", yspeed=" + yspeed + ", getXspeed()=" + getXspeed()
				+ ", getYspeed()=" + getYspeed() + ", getSpeed()=" + Arrays.toString(getSpeed()) + "]";
	}
	
	MovablePoint Move()
	{ 
		setX(getX() + xspeed);
		//setY(getY() + yspeed);
		return this ;
		
	}
}
public class PointMoveblepoint_4 {

	public static void main(String[] args) {
		MovablePoint mb = new MovablePoint (2.2f,2.4f,5.5f,1.2f);
		System.out.println("Moveblae point x is "+mb.getSpeed()
		+"y is"+mb.getYspeed()
		+"yspeed is" +mb.getYspeed()
		+"speed is" +mb.Move()
		);
		System.out.println(mb);
	}

}
