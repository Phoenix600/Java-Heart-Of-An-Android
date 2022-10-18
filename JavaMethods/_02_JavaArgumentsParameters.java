public class _02_JavaArgumentsParameters {



    // The actual value of passed to an parameter is called argument 
    static void sayHello(String fname) {
        System.out.println("Hello " + fname);
    }

    public static void main(String... var) {

        sayHello("Radhe Shyan Tiwari");
    }
}
