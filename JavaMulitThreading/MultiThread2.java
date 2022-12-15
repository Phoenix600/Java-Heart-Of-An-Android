class Main extends Thread 
{

    public void run()
    {
        int i = 1;
        while(true)
        {
            System.out.print(i + " Hello\n");
            i++;
        }
    }

    public static void main(String...args)
    {

        Main M = new Main();
        M.start();

        int i = 1;

        while(true)
        {
            System.out.print(i + " World\n");
            i++;
        }

    }
}
