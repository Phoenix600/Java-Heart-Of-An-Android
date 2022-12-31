// import java packages and classes here 
import java.lang.Thread;


/**
 * Example on Daemon threads 
 */
class MyThread extends Thread 
{
    @Override
    public void run()
    {
        // write the code for thread here 
        int count = 1;

        while(true){System.out.println( "Hello "+ (count++));}

    }
}

public class Main_08 
{
    public static void main(String...args)
    {
        MyThread thread = new MyThread();
        thread.setDaemon(true); // Daemon thread are dependent on the application 
        /*
        * As the main methods ends the demon thread also terminate.
        */
        thread.start();

        for(int i = 100; i > 0; i--)
        {
            System.out.println(i);
        }
    }
}
 