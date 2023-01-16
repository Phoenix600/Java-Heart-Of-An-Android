// Reference of abstarct classes is allowed but can not create the object 
abstract class Super
{
    Super()
    {
        System.out.println("I'm not comming back to you....");
    }

    void method1()
    {
        System.out.println("I used to love you a lot...But you never love me, back so decided to back off");
    }

    abstract void method2(); // If were together, this method would never be empty.

}

// Concrete Class 
class Super2 extends Super
{
    @Override
    void method2()
    {
        System.out.println("Looks like its never too late, to get-together");
    }
}


public class AbstractClass1 {
    public static void main(String[] args) {
        Super S = new Super2();
        S.method1();
        S.method2();                
    }    
}
