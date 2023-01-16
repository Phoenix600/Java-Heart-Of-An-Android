interface MyLambda 
{
    void print(String str);
}

public class LambdaExp9 {

    public void reverse(String str)
    {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
    public static void main(String[] args) {
        
        // Since The methods is not static, so we wll object 
        // This time reference of object.
        LambdaExp9 OBJECT  = new LambdaExp9();
        MyLambda ml = OBJECT::reverse; 
        ml.print("OHSO");
    }    
}
