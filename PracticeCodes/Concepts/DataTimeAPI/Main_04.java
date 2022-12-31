import java.util.*;

class Main {

    public static void main(String...args)
    {
        GregorianCalendar gc = new GregorianCalendar();
        
        TimeZone TZ = gc.getTimeZone();
        System.out.println(TZ.getDisplayName());

        System.out.println(TZ.getID());
    }
    
}
