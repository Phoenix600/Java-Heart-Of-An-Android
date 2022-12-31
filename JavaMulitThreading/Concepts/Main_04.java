import java.lang.Thread;
/**
 * Threads in java have priorities 
 * Normal Priority or Average priority or default priorty is 5  
 */

class MyThread implements Runnable{
    @Override
    public void run()
    {
        int i = 0;
        while(true)
        {
            System.out.println("Hello " + i);
            i++;
        }
    }
}


public class Main_04{
    public static void main(String...args) throws Exception
    {
        Thread thread = new Thread(new MyThread(),"MyThread");  
        thread.start();
         
    }
}
