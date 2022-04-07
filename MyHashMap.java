package Hashtable;

public   class MyHashMap {
	Node[] rootArray=new Node[4];
	String get(int key)
	{
		int index=key%rootArray.length;
		if(rootArray[index]==null)
			return"not found";
		else
		{
			Node temp=rootArray[index];
			while(true)
			{
				if(temp.key==key)
				return temp.value;
				else if(temp.next==null)
					return "not found";
				else
					temp=temp.next;
				
				}
			}
		}
	void print()
	{
		for (int i = 0; i < rootArray.length; i++) 
		{
			printMyLinkedList(rootArray[i]);
		}
	}
	private void printMyLinkedList(Node temp) 
	{
	while(temp!=null)
	{
		System.out.println(temp.key+" "+temp.value);
		temp=temp.next;
	}
		
	}
	void put(int key,String value)
	{
		int index=key%rootArray.length;
		if(rootArray[index]==null)
		{
			rootArray[index]=new Node(key,value);
		}
		else
		{
			Node temp=rootArray[index];
			while(temp.next!=null)
			{
				temp=temp.next; 
			}
			temp.next=new Node(key,value);
		}
	}
		
		
	}


