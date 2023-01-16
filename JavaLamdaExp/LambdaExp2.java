interface MyLambda 
{
    void display(String name);
}

class My implements MyLambda 
{
    public void display(String name)
    {
        System.out.println("My.display()");
    }
}
public class LambdaExp2 {
    public static void main(String[] args) {
        
        MyLambda M = (s)->{System.out.println("Hello "+s);};
        M.display("Pranay");

    }   
}
