import java.lang.Thread;

class MyThread extends Thread 
{
    public MyThread(String name)
    {
        super(name);
        setPriority(Thread.MAX_PRIORITY-1);
    }
}

public class Main_06 {

    public static void main(String[] args) {
        MyThread thread = new MyThread("Sample-Thread");
        System.out.println("Priority : " + thread.getPriority());
    }
    
}
