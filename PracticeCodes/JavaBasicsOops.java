// Import java classes here 

// Declare the classes here 
class Person
{
	String name;
	int age;
	int speed;
	
	void isWalking()
	{
		System.out.println(name  + " is walking");
	}

	void isEating()
	{
		System.out.println(name + " is eating teh food" );
		
	}

	void isRunning(int speed)
	{
		this.speed = speed;
		System.out.println(name +" is running " + speed + " miles per hour");
	}
}

// Java main class  and methods
public class JavaBasicsOops
{	
	public static void main(String...args)
	{
		Person p1 = new Person();
		Person p2 = new Person();

		p1.name = "Pranay Ramteke";
		p1.age = 21;

		p2.name = "Charlie Jr.";
		p2.age = 12;

		System.out.println("[+]Name : " + p1.name);
		p1.isWalking();

		p2.isEating();
		p1.isRunning(8);

		

	}
	
}
