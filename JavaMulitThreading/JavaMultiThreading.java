class MultiThread implements Runnable
{
    public void run()
    {
        int i = 0;
        while(true)
        {
            System.out.print(i + "Hello\n");
            i++;
        }
    }
}



class Main 
{
    public static void main(String...args)
    {
        MultiThread M = new MultiThread();
        Thread t = new Thread(M);
        t.start();

        int i = 1;
        while(true)
        {
            System.out.print( i +"World\n");
            i++;
        }

    }
}
