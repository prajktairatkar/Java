package hashset;

import java.util.LinkedList;

public class sort {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(7);
		for (int i = 0; i < list.size(); i++) 
		{
		for (int j = i+1; j < list.size(); j++) 
		{
		if(list.get(i)>list.get(j))
		{
			Integer temp=list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
//			list.set(i, list.get(j)+list.get(i));
//			list.set(i, list.get(j)-list.get(i));
//			list.set(i, list.get(j)-list.get(i));
		}
		}	
		}
		System.out.println(list);

	}

}
