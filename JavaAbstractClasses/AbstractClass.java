abstract class Super 
{
    public Super() {System.out.print("Super Constructor\n");}

    public void method1(){System.out.print("Methods 1 of Super class\n");}

    abstract public void method2();
}


class Sample1 extends Super{
    
    @Override
    public void method2()
    {
        System.out.println("This was the method is in Super class as abstract methods");
    }

    // public void method1(){System.out.println("Methods of Sample1");}
}

public class AbstractClass
{
    public static void main(String[] args) {
        Sample1 S = new Sample1();
        S.method1();
        S.method2();
    }
}