class MyThread extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.print(i + "Hello\n");
            i++;
        }
    }
}


class Main
{
    public static void main(String[] args)
    {
        MyThread T = new MyThread();
        T.start();
        int i = 1;
        while(true)
        {
            System.out.print(i + "World\n");
            i++;
        }
    }
}
