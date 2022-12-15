class Rectangle
{
    private int length;
    private int breadth;

    // Property Methods : How to access the data  And the are also used to validate the input values provided by the user 
    public int getLength()
        
    {
        return length;
    }

    public void setLength(int l)
    {
        if(l>0)
        {
            this.length = l;
        }else{
            length = 0;
        }

    }

    public int getBreadth()
    {
        return breadth;
    }

    

    public void setBreadth(int b)
    {
        if(b>0)
            breadth = b;
        else
            breadth = 0;
    }


}


public class JavaDataHiding
{
    public static void main(String...args)
    {

    }
}
