// Passing Lambda expression as parameter 
interface MyLambda 
{
    public void display();
}

class UseLambda 
{
    public void callLambda(MyLambda ml)
    {
        ml.display();
    }
}

class Demo
{
    void method1(MyLambda ML)
    {
            ML.display();
    }
}



public class LambdaExp5
{
    public static void main(String[] args) {
        
        Demo D = new Demo();
        D.method1(
            ()->{
                System.out.print("Be the man in the house");
                System.out.println("\nSo Your woman say proudly that he is my Man");
            }
        );
    }
}