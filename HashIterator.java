package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashIterator {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(3);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		set.add(10);
		set.add(11);
		set.add(12);
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
