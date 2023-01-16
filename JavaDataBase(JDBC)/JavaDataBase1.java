import java.sql.*;

public class JavaDataBase1 {

    public static void main(String...args) throws Exception
    {

        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:D://Code//Java//Java-Heart-Of-An-Android//JavaDataBase//EMPLOYEE.db");
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("select * from EMPLOYEE");
        
        
        while(rs.next())
        {
            System.out.printf("%18d %18s %18s %18s \n",rs.getInt("id"),rs.getString("name"),rs.getString("dept"),rs.getString("date_of_joining"));
        }

        stm.close();
        con.close();

    }
    
}
