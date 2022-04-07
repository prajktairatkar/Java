package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Comparetor {

	public static void main(String[] args) {
		ArrayList<Student> list2=new ArrayList<Student>();
		list2.add(new Student (1,"somu",40));
		list2.add(new Student (2,"gomu",43));
		list2.add(new Student (4,"somya",42));
		list2.add(new Student (3,"gomya",41));
		Collections.sort(list2,new Abcd());
		System.out.println(list2);

	}

}
