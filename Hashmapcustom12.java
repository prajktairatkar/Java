package collectionframework;

//import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Emp500{
	String name;
	int id;
	Emp500(String name,int id){
		this.name = name;
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	void setId(int id1)
	{
		this.id = id;
	}
	void setName(String name)
	{
		this.name = name;
	}
}

	

	public class Hashmapcustom12 {


	public static void main(String[] args) {
		Emp500 obj1 = new Emp500("ab",1);
		Emp500 obj2 = new Emp500("cd",4);
		Emp500 obj3 = new Emp500("vg",2);
		Emp500 obj4 = new Emp500("po",3);
		TreeMap<Integer,Emp500> tm = new TreeMap<>();
		tm.put(1, obj1);
		tm.put(2, obj2);
		tm.put(3, obj3);
		tm.put(4, obj4);
	for(Map.Entry<Integer,Emp500> m:tm.entrySet())
	{
		
		int i = m.getKey();
		System.out.println( m.getValue().id+" "+m.getValue().name);
	}
	System.out.println("-------------");
	for(Map.Entry<Integer,Emp500> m:tm.entrySet())
	{
		
		Emp500 s  = m.getValue();
		System.out.println( m.getValue().name+" "+m.getValue().id);
	}
	}

}
