import java.util.Scanner;

import java.sql.*;

class EmployeeDataBase {
    private String DataBasePath = "C://Users//phoenix//Desktop//Java Practicals//Practical_09//database.db";

    private String addRecord = "insert into employee values(?,?,?,?,?)";
    private Scanner Input;
    private String removeRecord = "delete from employee where id=?";
    private String searchRecord = "select * from employee where id=?";
    private Connection con;
    private Statement stm;
    private PreparedStatement stm1;
    private PreparedStatement stm2;
    private PreparedStatement stm3;
    private Statement stm4;
    private ResultSet rs;

    // Methods
    void add() {

        try {

            stm1 = con.prepareStatement(addRecord);

            System.out.print("[+]Enter the id : ");
            int id = Input.nextInt();
            Input.nextLine();

            System.out.print("[+]Enter the name : ");
            String name = Input.nextLine();

            System.out.print("[+]Enter the desigantion : ");
            String desig = Input.nextLine();

            System.out.print("[+]Enter the department  : ");
            String dept = Input.nextLine();

            System.out.print("[+]Enter the Date of Joining : ");
            String doj = Input.nextLine();

            System.out.println("Name    : " + name);
            System.out.println("ID      : " + id);
            System.out.println("Design  : " + desig);
            System.out.println("Dept    : " + dept);
            System.out.println("DOJ     : " + doj);

            stm1 = con.prepareStatement(addRecord);
            stm1.setInt(1, id);
            stm1.setString(2, name);
            stm1.setString(3, desig);
            stm1.setString(4, dept);
            stm1.setString(5, doj);

            stm1.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    void delete() {
        System.out.print("[+]Enter the id : ");
        int id = Input.nextInt();

        try {
            stm2 = con.prepareStatement(removeRecord);
            stm2.setInt(1, id);
            stm2.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    void search() {
        System.out.print("[+]Enter the employee ID : ");
        int key = Input.nextInt();

        try {

            stm3 = con.prepareStatement(searchRecord);
            stm3.setInt(1, key);

            rs = stm3.executeQuery();
            
            while (rs.next()) {
                System.out.println("ID              : " + rs.getInt(1));
                System.out.println("Name            : " + rs.getString(2));
                System.out.println("Designation     : " + rs.getString(3));
                System.out.println("Department      : " + rs.getString(4));
                System.out.println("Date Of joining : " + rs.getString(5));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void display()
    {
        try{
            stm4 = con.createStatement();        
            rs = stm4.executeQuery("select * from employee");
            while(rs.next())
            {
                System.out.printf("%24d %24s %24s %24s %24s\n",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            }

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    void menu()
    {
        
        int INDEX;

        String MENU[] = {"ADD","REMOVE","SEARCH","DISPLAY"};
        
        for(int i=0; i<MENU.length; i++)
        {
            System.out.printf("%10d %10s\n",i+1,MENU[i]);
        }

        INDEX = 0;
        
        while(true && INDEX !=99)
        {
            System.out.print("Enter your choice ");
            INDEX = Input.nextInt();
            switch (INDEX) {
                case 1:
                    this.add();                            
                    this.menu();
                    break;
                case 2:
                    this.delete();
                    this.menu();
                    break;
                case 3:
                    this.search();
                    this.menu();
                    break;
                case 4:
                    this.display();
                    this.menu();
                    break;
                default:
                    break;
            }
        }

    }

    public EmployeeDataBase() {
        try {

            Input = new Scanner(System.in);

            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:" + DataBasePath);
            stm = con.createStatement();
            stm.executeUpdate("create table employee(id integer, name text, desig text, dept text, doj text)");

        } catch (Exception e) {
            // System.out.println(e);
            // System.out.println("Data Base Already exits in the memory");
            System.out.println("[STATUS] : Data Base Loaded....");
        }
    }

}

public class Practical_09 {
    public static void main(String[] args) throws Exception {
        EmployeeDataBase DB = new EmployeeDataBase();
        DB.menu();
    }
}
