interface Addable 
{
	int add(int a, int b);
}

public class JavaLambdaExp4
{
	public static void main(String[] args)
	{

		Addable ad1 = (int A,int B)->(A+B);
		System.out.println(ad1.add(12,14));


		Addable ad2 = (int A,int B)->(A+B);
		System.out.println(ad2.add(19,20));

		Addable ad3 = (c,d)->(c+d);
		System.out.println(ad3.add(12,13));


		Addable ad4 = (int x, int y)->{
			return x+y;
		};

		System.out.println(ad4.add(89,99));

	}
}

