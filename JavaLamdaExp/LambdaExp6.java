interface MyLambda 
{
    public void print(String str);
}


// Methods refferencing 
public class LambdaExp6
{
    public static void main(String[] args) {
        MyLambda ml =System.out::println;        
        ml.print("Hello Pranay, I know you love C Programming");
    }
}