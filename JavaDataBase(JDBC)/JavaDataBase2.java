import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class JavaDataBase2 {

    public static void main(String[] args) throws Exception 
    {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("JDBC:sqlite:D://Code//Java//Java-Heart-Of-An-Android//JavaDataBase//EMPLOYEE.db");
            PreparedStatement stm = con.prepareStatement("insert into EMPLOYEE values(?,?,?,?)");

            // taking data from the user 
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the data of student : ");
            int id = input.nextInt();
            input.nextLine();
            String name = input.nextLine();
            String dept = input.nextLine();
            String DOJ = input.nextLine();

            // Setting the values in the prepared statement 
           stm.setInt(1,id); 
           stm.setString(2,name); 
           stm.setString(3,dept); 
           stm.setString(4,DOJ); 

           stm.executeUpdate();

           input.close();
           stm.close();
           con.close();
            
        
    }
    
}
