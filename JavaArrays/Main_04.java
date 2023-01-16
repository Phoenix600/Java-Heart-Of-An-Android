public class Main_04 {
    
    public static void main(String...args)
    {
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        int sum = 0, key = 12, max, min, INDEX=-1;
        max = A[0];
        min = A[0];

        for(int i = 0; i < A.length; i++)
        {
            if(A[i] == key){INDEX = i;}
            sum += A[i];
            if(A[i] > max){max = A[i];}
            if(A[i] < min){min = A[i];}
        }

        System.out.printf("%d %d %d %d",min,max,INDEX,sum);

    }

}
