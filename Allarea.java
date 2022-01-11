package edubridge;

public class Allarea {

	public static void main(String[] args) {
		float length = 2, breadth =3,base = 4,height =5,radius = 10,side = 4;
		float Areacircle, Areasquare,Arearect,Areatriangle;
		Areacircle = 3.14f*(radius)*(radius);
		Areasquare = (side)*(side);
		Arearect = length * breadth;
		Areatriangle = base*height/2;
		System.out.println("The area of circle radius " +radius+ " is " +Areacircle);
		System.out.println("The area of square side " +side+ " is " +Areasquare);
		System.out.println("The are of rectangle length " +length+ " and breadth " +breadth+ " is " +Arearect );
		System.out.println("The area of triangle base " +base+ " and " +height+ " is " +Areatriangle);
	}

}
