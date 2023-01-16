interface StringConcat 
{
	String run(String str);
}

public class JavaLambdaExp3
{
	static void printFormated(String str, StringConcat format)
	{
		String result = format.run(str);
		System.out.println(result);
	}


	public static void main(String[] args)
	{
		StringConcat exclamation = (str) -> str + "!";
		StringConcat question = (str)->str + " ?";

		printFormated("GOD",exclamation);
		printFormated("Where are you", question);
	}
	



}
