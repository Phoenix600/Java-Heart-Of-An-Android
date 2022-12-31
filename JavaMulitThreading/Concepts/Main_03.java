import java.lang.Thread;

class SayHello
{
    int i = 1;

    void displayHello(){ System.out.println((i++) + "Hello");}
}

// Why Runnable : If our class is inheriting from other class , we still want to use 
// that class object thread, we use Runnable interface. 
class MyNakliThread extends SayHello implements Runnable
{
    @Override
    public void run(){while(true){ displayHello();}}
}

public class Main_03
{
    public static void main(String...args)
    {
            int j = 0;

            MyNakliThread dummy = new MyNakliThread();
            Thread realThread = new Thread(dummy);
            realThread.start();

            while(true){ System.out.println((j++) +" World");}
    }
}