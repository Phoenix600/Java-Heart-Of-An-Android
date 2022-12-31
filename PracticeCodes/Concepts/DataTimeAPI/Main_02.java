import java.util.*;

class Main 
{
    public static void main(String...args)
    {
        Date d = new Date();
        System.out.println("Todays Date And Current Time is : " + d);

        Date d1 = new Date(System.currentTimeMillis());
        System.out.println("Same : " + d1);


        Date d2 = new Date("12/12/12");
        System.out.println("You cann also set the date : " + d2);


        Date d3 = new Date();
        System.out.println("Current Time in MilliSeconds : " + d3.getTime());
        System.out.println("Current Day Of The Week : " + d3.getDay());
        System.out.println("Current Day is : " + d3.getDate());

        // MM // DD // YY
        Date d4 = new Date("12/12/12");
        System.out.println("The Current Month        : " + (d4.getMonth()+1));
        System.out.println("The Current Year         : " + (d4.getYear() + 1900));
        System.out.println("The Current Day of Week  : " + d4.getDay());
        System.out.println("The Current Date         : " + d4.getDate());


    }
}