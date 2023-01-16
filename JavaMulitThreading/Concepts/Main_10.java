import java.lang.Thread;

// Example on Daemon Thread , Join() method and yeild() method
class MyThread extends Thread {
    @Override
    public void run() {
        int count = 0;
        while (count != (int) 1e7 + 1) {
            System.out.println(++count);
        }
    }
}

public class Main_10 {
    public static void main(String... args) {
        MyThread thread = new MyThread();
        thread.setDaemon(true);
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
