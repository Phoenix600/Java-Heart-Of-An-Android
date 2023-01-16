public class Main_03 {
    public static void main(String... args) {

        // crating the array in the heap
        int A[] = new int[12];
        A[0] = 12;
        A[1] = 14;
        A[11] = 13;


        // Displaying the array elements using the for loop
        for (int i = 0; i < A.length; i++) {

            System.out.println("Array[" + i + "] : " + A[i]);

        }

        for(int x : A)
        {
            System.out.print(x + " ");
        }

    }
}
