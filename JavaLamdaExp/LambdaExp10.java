interface MyLambda 
{
    void display(String str);
}
public class LambdaExp10 {
    
    public LambdaExp10(String str)
    {
        System.out.println(str.toUpperCase());
    }
   public static void main(String[] args) {
        MyLambda ml = LambdaExp10::new;
        ml.display("pranay ramteke");
   } 
}
