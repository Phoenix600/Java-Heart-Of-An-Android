public class Main_01 
{
    public static void main(String...args)
    {
        // A is reference  : In java every array is object 
        // Every array in java is created in heap 
        int A[] = new int[(int)1e7+10];

        A[0] = 12;
        A[1] = 13;
        A[(int)1e7+9] = 99;

        for(int i = 0; i <A.length; i++)
        {
            if(i == (int)1e7+9)
            {
                System.out.println(A[i]);
                System.out.println(A.length);
                System.out.println( A.getClass());
            }
        }

    }
}