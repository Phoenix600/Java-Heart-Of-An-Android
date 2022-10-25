import java.util.Random;

/**
#TODO: [] Create the object of Random class
       [] Generate the unlimited stream of random long values 
       [] Generate the array of boolean values 
       [] Generate the array of radnom byes using the arrays
*/
public class _01_JavaRandomClass
{
    static void printArray(boolean[] arr, int size)
    {
        for(int i=0; i<size; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String...args)
    {
        System.out.println("Getting started with the Java Random Classes ");

        Random rand = new Random();

        boolean[] array = new boolean[10];
        int i=0;

        for(i=0; i<10; i++)  array[i] = rand.nextBoolean();
        

        array[0] = rand.nextBoolean();
        array[1] = rand.nextBoolean();
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array.length);
        printArray(array,10);
    }
}
