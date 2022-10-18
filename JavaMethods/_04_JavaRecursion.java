public class _04_JavaRecursionum
{
    static int getSum(int num)
    {
        if(num == 0)
               return 0;
        if(num==1)
                return 1;
        return num + getSum(num-1);
            
    }

    public static void main(String...args)
    {
            System.out.printf("[+]The sum of first 10 Non-Zero positive integers is : %d",getSum(10));

    }
}

