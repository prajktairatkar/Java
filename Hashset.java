package hashset;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<Integer>set=new HashSet<Integer>();
		set.add(10);
		set.add(11);
		set.add(12);
		set.add(13);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(21);
		for(int a:set)
		{
			System.out.println(a);
		}
		System.out.println();
		System.out.println("now array");
		int[]a= {2,3,4,5,7,5,4};
		for(int p:a)
		{
			System.out.println(p);
		}

	}

}
