class FirstClass1
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
     * @param args
     */ 
   public static void main(String...args)
   {
        FirstClass1 ET20001 = new FirstClass1();    
        ET20001.setData("Pranay", "Ramteke");
        ET20001.getData();

   } 
}
