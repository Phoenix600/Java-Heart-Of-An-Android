interface MyLambda 
{
    public void display(String str);
}
public class LambdaExp7 {

    public static void main(String[] args) {
        MyLambda m = System.out::print;
        m.display("Hello Pranay");;
    }
    
}
