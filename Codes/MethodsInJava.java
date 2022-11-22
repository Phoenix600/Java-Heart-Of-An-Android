import java.util.*;

class Main
{
    // Methods in the java 
    static void myQuote()
    {
        System.out.println("You become extra-ordinary by doing ordinary things in extra ways");
    }
    
    static void sampleFunction(int numPrompt)
    {
        System.out.println("You have prompted the number to me as : "  + numPrompt);
    }

    static void hashFunction(String password)
    {
      System.out.print("The orignal password waS : " + password + "\n");

      byte[] HASH = new byte[password.length()];
      HASH = password.getBytes();
      // System.out.print("HASHED PASSWORD : " + HASH.toString());
      for(int i=0; i< HASH.length; i++)
      {
        System.out.print((HASH[i]%10 + 7+ (int)('S'))%2);
      }
    }

    public static void main(String...args)
    {
        
           myQuote();
           sampleFunction(1212);
           hashFunction("GREEN^LANTERN@1212");

    }
}
