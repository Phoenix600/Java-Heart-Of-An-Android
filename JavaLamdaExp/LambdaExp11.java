// Implementing the polymorphsim like mechanism using the lambda expressions 
interface MyLambda 
{
    int print(String str0,String str1);
}
public class LambdaExp11 {
 public static void main(String[] args) {

    MyLambda ml = String::compareTo;
    System.out.println(ml.print("Pranay", "Ranay"));
 }   
}
