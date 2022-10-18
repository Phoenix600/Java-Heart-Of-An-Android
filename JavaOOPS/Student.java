import java.util.Scanner;


class Student
{
    static final int SIZE = 5;
    String fname;
    String lname;
    String description;
    char section;
    double[] marks = new double[SIZE];
    double total_marks = 0;
    double percentage;
    
    void setData()
    {
        Scanner Input = new Scanner(System.in);
        System.out.print("[+]Enter your name : ");
        fname = Input.next();
        lname = Input.next();

        System.out.print("[+]Describe yourself in 50 words : ");
        description = Input.nextLine();

        System.out.print("[+]Enter your section : ");
        section = Input.nextLine().charAt(0);

        System.out.println("[+]Enter Marks of the subject : ");
        for(int i=0; i<SIZE; i++)
        {
            System.out.printf("Subject[%d] : ", i);
            marks[i] = Input.nextDouble();
        }

        for(int i=0; i<SIZE; i++)
        {
            total_marks += marks[i];
        }
        percentage = (total_marks/SIZE)*100;

        Input.close();
    }
}