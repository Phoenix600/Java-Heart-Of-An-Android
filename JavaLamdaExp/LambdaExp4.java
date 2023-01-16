interface MyLambda 
{
    public void display();
}

class Demo
{
    public void method1()
    {
        MyLambda ml = ()->System.out.println("Im Lamnda Expression");
        MyLambda ml1 = ()->{
            int count = 0;
            System.out.println("YOLO");
            System.out.println("Start Winning In Your Life");
            System.out.println("You can do this");
            System.out.print("Its : "+ count);
            count +=1;
            System.out.print("Either Its : "+ count);
        };

        ml.display();
        ml1.display();
    }
} 


public class LambdaExp4 {
    public static void main(String[] args) {
        
        Demo D = new Demo();
        D.method1();
    }    
}

/**
 * Notes : 
 *  1. A lambda expression can have its own variable and you can use them 
 *  2. A lambda expression can access the variables of the method in which 
 * it is defined but those variable must be final or effectively final
 * 3. A lambda expression can capture the instance varibales they may 
 * and may not be final and lambda expression can modify them.
 * 4. Lambda expression are similar to anonymous inner classes 
 */