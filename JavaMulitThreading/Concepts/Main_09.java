import java.lang.Thread;

// Example on Daemon thread 
class MyThread extends Thread 
{
    @Override 
    public void run()
    {
        int count = 1;
        while(true){System.out.println("Hello " + (count++));}
    }
}

public class Main_09 {

    public static void main(String...args)
    {
        MyThread thread = new MyThread();
        thread.setDaemon(true);
        thread.start();
        
        try{Thread.sleep(100);}catch(Exception e){System.out.println(e);}
        
        System.out.println("================NOTE============\nSince Main() fnction has stopped\nand Daemon Thread depends on the main() methods,\nso daemon also terminates or get killed as soon as the main() methods is finished");
        
    }
    
}
