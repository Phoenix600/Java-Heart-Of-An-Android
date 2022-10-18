public class _02_JavaArgumentsParameters {

    static void sayHello(String fname) {
        System.out.println("Hello " + fname);
    }

    public static void main(String... var) {
        sayHello("Radhe Shyan Tiwari");
    }
}
