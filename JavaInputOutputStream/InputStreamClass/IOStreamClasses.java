import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Using the fileOutputStream you can create the file

class Main 
{
    public static void main(String[] args)
    {

        try{

        FileOutputStream fos = new FileOutputStream("D:/Code/Java/Java-Heart-Of-An-Android/JavaInputOutputStream/InputStreamClass/Files/File.txt");
        
        String str = "Learn java programming";

        fos.write(str.getBytes());
        fos.close();

        }
        catch(FileNotFoundException e)
        {
                System.out.println(e); 
        }catch(IOException e)
        {
            System.out.println(e);
        }

    }
} 