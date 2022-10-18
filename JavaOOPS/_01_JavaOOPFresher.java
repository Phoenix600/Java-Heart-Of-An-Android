class FirstClass
{
    String fname;
    String lname;

    void setData(String fname, String lname)
    {
        this.fname = fname;
        this.lname = lname;
    }

    void getData()
    {
        System.out.println("[+]First Name : " + this.fname);
        System.out.println("[+]First Name : " + this.lname);
    }
}

public class _01_JavaOOPFresher
{
    /**
     * #TODO: Added new code for class creation 
     * #FIXME: Code should be optimized
     * @param args
     */ 
   public static void main(String...args)
   {
        FirstClass ET20001 = new FirstClass();    
        ET20001.setData("Pranay", "Ramteke");
        ET20001.getData();

   } 
}