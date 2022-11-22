import java.util.*;

class Main 
{

        static void FloorMultiplication(int x, double y)
        {
               int result = x * (int)Math.floor(y);
               System.out.printf("Result : " + result);
        }
                  

        public static void main(String[] args)
        {
               FloorMultiplication(12,12.1212); 
            
        }
}
