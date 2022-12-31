import java.lang.Thread;

class MyThread  extends Thread
{
    private int i = 0;

    public void sayMyName()
    {
        System.out.println("Pranay Ramteke");
    }

    public void display()
    {
        ++i;
        System.out.println( i + " Hello");
        sayMyName();
    }

    @Override
    public void run()
    {
        while(true)
        {
        display();
        }

    }
}

public class Main_02
{
    public static void main(String...args)
    {
        int j = 0;

        MyThread thread = new MyThread();
        thread.start();
        
        while(true)
        {
            ++j;
            System.out.println(j + " World"); 
        }
        
    }
}