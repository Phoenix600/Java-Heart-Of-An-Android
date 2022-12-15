

public class ArrayAsADT {
    
    public static void main(String[] args) {
        
        int A[] = {12,13,14,15,16,17};
        int[] B = new int[A.length];

        int[] D = new int[12];
        D[0] = 12;
        D[1] = 17;

        for (int i = 0; i < D.length; i++) {
            System.out.println(D[i]);   
        }

        B=A;
        A=null;
        System.out.println(B[0]);

        int[] C = new int[5];

        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]);   
        }


    }

}
