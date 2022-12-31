import java.lang.Thread;

// Adding delay to the thread , sleep is static methods, access sleep() methdis without using the 'this' keyword  

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        setPriority(MAX_PRIORITY);
    }

    @Override
    public void run() {
        int i = 0;

        while (true) {
            System.out.println(i++);
            try {
                sleep(100); // 100 miliseconds time delay 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}

class Main_07 {

    public static void main(String... args) {
        MyThread thread = new MyThread("Thread-1");
        thread.start();

        while (true) {
            try {
                Thread.sleep(100);
                thread.interrupt();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
