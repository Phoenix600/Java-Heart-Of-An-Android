import java.lang.Thread;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

class MyThread extends Thread{
    
    // Constructor 
    public MyThread(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        System.out.println("Thread has been started and killed");
    }
}


class Main_05 {

    public static void main(String...args) throws Exception
    {
        MyThread thread = new MyThread("Thread-1"); // Setting the name of the thread 

        // Instance Methods Demo : 
        thread.start();
        System.out.println("State   : " + thread.getState());
        System.out.println("Daemon  : " + thread.isDaemon());
        System.out.println("Alive   : " + thread.isAlive());
        System.out.println("INTR    : " + thread.isInterrupted());
        System.out.println("Name    : " + thread.getName());
        System.out.println("Priority: " + thread.getPriority()); // Default priority of the thread is 5 

        // #TODO: The below methods getId() is depricated in latest version of the java. Instead use threadId() method() 
        System.out.println("ID      : " + thread.getId());
        System.out.println("ID      : " + thread.threadId());
        System.out.println("State   : " + thread.getState());         

    } 

    
}
