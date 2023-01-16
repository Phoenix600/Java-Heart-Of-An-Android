/*
By default all methods in interface are public and abstract 
If interface having only having single abstarct method then it is called as functional interface 

*/

@FunctionalInterface 
interface MyLambda
{
	public void display();
}

class My implements MyLambda 
{
	public void display()
	{
		System.out.println("Hello JVM");
	}
}

public class LambdaExp1{
	public static void main(String...args)
	{
		MyLambda m = new My();
		m.display();

		// Annonymous Class
		MyLambda M = new MyLambda() {
			public void display()
			{
				System.out.println("Hello people");
			}
		};
		M.display();

		// Annonymous Methods 
		MyLambda mM = ()->{System.out.printf("Hello JVM");};
		mM.display();

	}
}
