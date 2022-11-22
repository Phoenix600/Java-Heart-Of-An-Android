import java.io.ByteArrayInputStream;

class IO 
{
	// Fields 
	String sampleData =  new String("Hello World");
	
	void readFile()
	{
		
		// Allocating the buffer for the byte array 
		byte b[] = sampleData.getBytes();	

		// Allocating the memory for the ByteArrayInputStream to read the data in the form of bytes
		ByteArrayInputStream bias = new ByteArrayInputStream(b);
	
		// declaring the iterator i
		int i;
	
		while((i=bias.read())!= -1)
		{
			System.out.print((char)i);
		}	
	}		
}

public class InputStreamTest
{
	public static void main(String...args)
	{
		IO obj = new IO();
		obj.readFile();
	}
}