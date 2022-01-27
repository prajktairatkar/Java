class Animal
{
	 Animal()
	{
		System.out.println("parent class ");
	}
}
class Dog extends Animal{
	 Dog()
	{
		System.out.println("child class1 ");
	}
}
class Cat extends Dog
{
	 Cat() {
		System.out.println("child class 2");
	}
}
public class Multilevel {

	public static void main(String[] args) {
	Cat ob = new Cat();
	

	}

}
