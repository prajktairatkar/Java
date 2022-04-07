package oopsjava29jan;
class Animal
{
	String name;
	Animal(String name)
	{
		this.name = name;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
}
class Mammel extends Animal
{

	Mammel(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mammel [Animal [name=" + name + "]]";
	}
	
}
class cat extends Mammel
{

	cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void greets()
	{
		System.out.println("meoww");
	}

	@Override
	public String toString() {
		return "cat [Animal [name=" + name + "]]";
	}
	
}
class Dog<another> extends Mammel{

	Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void greets()
	{
		System.out.println("woof");
	}
	public void greets (another Dog)
	{
		System.out.println("woooooooof");
	}

	@Override
	public String toString() {
		return "Dog [Animal [name=" + name + "]\"]";
	}
	
}
public class Animals {

	public static void main(String[] args) {
	Mammel m = new Mammel("cow");
	m.toString();
	System.out.println(m);
	Dog dg = new Dog("cow1");
	dg.greets();
	dg.toString();
	dg.greets(dg);
	System.out.println(dg);

	}
	

}
