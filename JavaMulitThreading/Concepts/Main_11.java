import java.lang.Thread;


class MyThread implements Runnable 
{
    @Override 
    public void run()
    {
        int count = (int)1e4+3;
        while(count !=0){System.out.println(--count);}
    }
}

public class Main_11 {
    public static void main(String...args) throws Exception
    {
        MyThread t = new MyThread();
        Thread thread = new Thread(t,"Thread-1");
        thread.setDaemon(true);
        thread.start();

        Thread mainThread = Thread.currentThread();
          mainThread.join();        

    }    
}
