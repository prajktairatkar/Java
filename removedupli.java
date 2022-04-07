package hashset;

import java.util.LinkedHashSet;

public class removedupli {

	public static void main(String[] args) {
		int[] a= {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int p:a)
			set.add(p);
		System.out.println(set);

	}

}
