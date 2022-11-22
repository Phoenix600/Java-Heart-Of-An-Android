import java.io.ByteArrayInputStream;

class ioTest
{
	// Fields 
	String str = "\n Welcome to the byte stream";
	// Methods 
	void readFile()
	{
		// Allocating memory for the buffer 
		byte b[] = str.getBytes();

		// creating the object of ByteArrayInputStream to read data in the form of bytes
		ByteArrayInputStream bias = new ByteArrayInputStream(b);
		
		// declaring the iterator i 
		int i;
		while((i=bias.read())!= -1)
		{
			System.out.print((char)i);
		}
 
	}
}

public class InputStream{
	
	public static void main(String...args)
	{
		ioTest obj = new ioTest();
		obj.readFile();
	}
}