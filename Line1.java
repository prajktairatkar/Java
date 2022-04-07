package oopsjava29jan;
 class Point {
    private double x;
    private double y;

 Point() {
    this.x = 0.0;
    this.y = 0.0;
}
 Point(double x, double y) {
    this.x = x;
    this.y = y;
}
 void setX(double x) {
    this.x = x;
}
 void setY(double y) {
    this.y = y;
}
 double getX() {
    return this.x;
}
 double getY() {
    return this.y;
}
public String toString() {
    return "(" + this.x + ", " + this.y + ")";
}
}
 class Line {
    private Point p1;
    private Point p2;

    Line() {
       p1 = new Point(0,0);
       p2 = new Point(0,0);
   }

    Line(double x1, double y1, double x2, double y2) {
       p1 = new Point(x1, y1);
       p2 = new Point(x2, y2);
   }
    Line(Point p1, Point p2) {
       this. p1 = new Point(p1.getX(), p1.getY());//add this.p1 instead of p1
       this.p2 = new Point(p2.getX(), p2.getY());//add this.p2 intead of p2
   }
    Point getP1() {
       return this.p1;
   }
   Point getP2() {
       return this.p2;
   }
    void setP1(double x, double y) {
       this.p1 = new Point (x, y);
   }
   public void setP2(double x, double y) {
       this.p2 = new Point(x, y);
   }
   public double getSlope() {
       return ((p2.getY() - p1.getY()) / (p2.getX() - p1.getX()));
   }
}
public class Line1 {
	public static void main(String args[]) {
		 Point p = new Point(1.5, 3);
	        System.out.println(p.toString());
	        Point p1 = new Point(0, 3);
	        Point p2 = new Point(5, 5);
	        Line l = new Line(p1, p2);
	        System.out.println(l.getSlope()); 
	
	        
	}

}
