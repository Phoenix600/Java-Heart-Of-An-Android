import java.util.*;

public class RandomNumber
{
    public static void main(String...args)
    {
        int seed =  2000;
        Random rand = new Random();
        rand.setSeed(seed);

        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt());
    }
}