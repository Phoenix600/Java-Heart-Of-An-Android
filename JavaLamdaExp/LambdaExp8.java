interface MyLambda
{
    public void print(String str);
} 


public class LambdaExp8 {

    public static void reverse(String str)
    {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        MyLambda ml = System.out::println;
        ml.print(sb.toString());
    }
  public static void main(String[] args) {
    MyLambda ml = LambdaExp8::reverse;
    ml.print("Hello");
  }  
}
