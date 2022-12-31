import java.util.*;
// Depricated Time classs in Java.util.*;
class Main 
{
    public static void main(String...args)
    {
        //  Number of miliseconds passes since 1 Jan 1970 
        System.out.println(System.currentTimeMillis());
        System.out.println("Number of seconds passed since 1 Jan 1970 till today : " + System.currentTimeMillis());

        System.out.println("Total Number of Seconds Passed from  1 Jan 1970 till today  : " + (System.currentTimeMillis()/1000));

        System.out.println("Total Number of Minutes Passed from 1 Jan 1970 till today : " + (System.currentTimeMillis()/1000/60));

        System.out.println("Total Number of Hours Passed from 1 Jan 1970 till today : " + System.currentTimeMillis()/1000/60/60);

        System.out.println("Total Number of Day Passed from 1 Jan 1970 till today : " + System.currentTimeMillis()/1000/60/60/24);

        System.out.println("Total number of Year Passed from 1 jan 1970 till today : " + System.currentTimeMillis()/1000/60/60/24/365.25);

        System.out.println("The Maximum Range of Long " + Long.MAX_VALUE);

    }
}