abstract class KFC 
{
    KFC()
    {
        // write some code 
    }

    void makeItem()
    {
        // predefined KFC code 
    }

    abstract void billing();
    abstract void offer();
}

class MyKFC extends KFC 
{
    MyKFC()
    {
        // Write some code 
    }

    @Override 
    void billing()
    {
        // Write some code
    }

    @Override 
    void offer()
    {
        // Write some code 
    }

    void festiveOffers()
    {
        // Write some code 
    }

}

class Main 
{
    public static void main(String...args)
    {
        
        KFC K = new MyKFC();
    }
}

