interface MyLambda 
{
    int display(int A, int B);
}

class My implements MyLambda
{
    public int display(int A, int B){ return A+B;}
}

public class LambdaExp3 {
    public static void main(String[] args) {
        MyLambda M = (A,B)->{return A+B;};
        System.out.println(M.display(12, 13));        


        MyLambda Mm = (C,D)->{return C-D;};
        System.out.println(Mm.display(12, 10));


        MyLambda mm = (E,F)->E*F;
        System.out.println(mm.display(12, 12));

    }
    
}
