// Why we need multi-threading 
import java.lang.Thread;

class InfiniteLoopClass extends Thread
{
    private int i = 1;

    // void display()
    // {
    //     while(true)
    //     {
    //         System.out.println(i + " Hello");
    //         i++;   
    //     }        
    // }

    @Override
    public void run()
    {
        // display();
        while(true)
        {
            System.out.println(i + " Hello");
            i++;   
        }        
 
    }
}

public class Main_01
{
    public static void main(String...args)
    {
        InfiniteLoopClass thread = new InfiniteLoopClass();
        thread.start();

        int j = 1;

        while(true)
        {
            System.out.println( j+ " World");
            j++;
        }

    }
}