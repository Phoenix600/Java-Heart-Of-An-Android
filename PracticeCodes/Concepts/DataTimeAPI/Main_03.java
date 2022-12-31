import java.util.*;
import java.util.concurrent.Callable;

class Main{
    public static void main(String...args)
    {
        // Calander Class :  Abstract Class
        System.out.println("Getting Started With Java Calander Class");   

        // Globally we Follow the Calander Called Greogorian 
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2022));
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.YEAR));
        System.out.println(gc.get(Calendar.MINUTE));
        System.out.println(gc.get(Calendar.ZONE_OFFSET));

    }
}