package comparable;

import java.util.ArrayList;
import java.util.Collections;

import Student.Student;

public class comparabl {

	public static void main(String[] args) {
		ArrayList<Student> list2=new ArrayList<Student>();
		list2.add(new Student(1,"somu",40));
		list2.add(new Student(4,"somu",40));
		list2.add(new Student(2,"somu",40));
		list2.add(new Student(3,"somu",40));
		Collections.sort(list2);
		System.out.println(list2);
		

	}

}
