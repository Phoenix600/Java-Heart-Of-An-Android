import java.sql.*;

//#TODO:[] This code works 
class JavaDataBase
{
    public static void main(String[] args)throws Exception {


        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:/C://sqlite//EMPLOYEE.db");
        Statement stm = con.createStatement();
        ResultSet RS = stm.executeQuery("select * from employee");

        int ID;
        String Ename;
        String Depart;
        String Date_of_Joining;

        while(RS.next())
        {
            ID = RS.getInt("id");
            Ename = RS.getString("name");
            Depart = RS.getString("dept");
            Date_of_Joining = RS.getString("date_of_joining");
            System.out.printf("%d %s %s %s\n",ID,Ename,Depart,Date_of_Joining);
        }


    }
} 