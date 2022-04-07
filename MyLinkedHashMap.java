package LinkedHashMap;

public class MyLinkedHashMap {
	Node[] rootArray=new Node[4];
	Node linkedListRoot;
	
	void print()
	{
		if(linkedListRoot==null)
			System.out.println("empty");
		else
		{
			Node temp=linkedListRoot;
			while(temp!=null)
			{
				System.out.println(temp.key+" "+temp.value);
				temp=temp.NextGreen;
			}
		}
	}
	String get(int key)
	{
		int index=key%rootArray.length;
		if(rootArray[index]==null)
			return"Not found";
		else
		{
			Node temp=rootArray[index];
			while(true)
			{
				if(temp.key==key)
					return temp.value;
				else if(temp.nextBlue!=null)
					temp=temp.nextBlue;
				else return"Not found";
			
			}}
		}
		void put(int key,String value)
		{
			Node newObj=new Node(key,value);
			//blue wala logic
			int index=key%rootArray.length;
			if(rootArray[index]==null)
				rootArray[index]=newObj;
			else
			{
				Node temp=rootArray[index];
				while(temp.nextBlue!=null)
					temp=temp.nextBlue;
				temp.nextBlue=newObj;
			}
			//Green wala logic
			if(linkedListRoot==null)
				linkedListRoot=newObj;
			else
			{
				Node temp=linkedListRoot;
				while(temp.NextGreen!=null)
					temp=temp.NextGreen;
				temp.NextGreen=newObj;
			}
	
		
	}

}
