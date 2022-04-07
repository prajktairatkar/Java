package TreeMap;

public class MyTreeMap {
	Node root;
	String get(int key)
	{
		if(root==null)
			return"map is empty";
		else
		{
			Node temp=root;
			while (true)
			{
				if(key==temp.key)
					return temp.value;
				else if(key<temp.key && temp.left!=null)
					temp=temp.left;
				else if(key<temp.key && temp.left==null)
					return"key not present in map";
				else if(key>temp.key && temp.right!=null)
				temp=temp.right;
				else if(key>temp.key && temp.right!=null)
					temp=temp.right;
				else if(key>temp.key && temp.right==null)
					return" key is not present";
			}
		}
	}
	void put(int key,String value) 
	{
		if(root==null)
		{
			root=new Node(key,value);
		}
		else 
		{
			Node temp=root;
			while(true)
			{
				if(key==temp.key)
				{
					temp.value=value;
					break;
				}
				else if(key<temp.key && temp.left!=null)
					temp=temp.left;
				else if(key<temp.key)
				{
					temp.left=new Node (key,value);
					break;
				}
				else if(key>temp.key && temp.right!=null)
					temp=temp.right;
				else
				{
					temp.right=new Node(key,value);
					break;
				}
			}
		}
		
	}
	void print()
	{
		if(root!=null)
			printMyNode(root);
		
	}
	private void printMyNode(Node abcd)
	{
		if(abcd.left!=null)
			printMyNode(abcd.left);
		System.out.println(abcd.key+" "+abcd.value);
		if(abcd.right!=null)
			printMyNode(abcd.right);
		
	}
	public static void main(String[] args) {
		MyTreeMap map=new MyTreeMap();
		map.put(10, "1ninad");
		map.put(11, "2ninad");
		map.put(12, "3ninad");
		map.put(13, "4ninad");
		map.put(14, "5ninad");
		map.put(15, "6ninad");
		System.out.println(map.get(11));
	}


}
