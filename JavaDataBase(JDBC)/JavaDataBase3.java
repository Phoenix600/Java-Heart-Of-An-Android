import java.sql.*;

public class JavaDataBase3
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("org.sqlite.JDBC");

		Connection CON = DriverManager.getConnection("jdbc:sqlite:D://Code//Java//Java-Heart-Of-An-Android//JavaDataBase//EMPLOYEE.db");
		Statement STM = CON.createStatement();
		
		STM.executeUpdate("insert into employee values(17,'Alisha M','Designer','12/4/18')");


		STM.close();
		CON.close();
	}
}
