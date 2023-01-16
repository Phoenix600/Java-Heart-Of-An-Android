class Subject {
    private String id;
    private String name;
    private int maxMarks;
    private int marksObtained;

    // Getter() Method
    public String getId() {return this.id;}
    public String getName() {return this.name;}
    public int getMaxMarks() {return this.maxMarks;}
    public int getObtainedMarks() {return this.marksObtained;}

    // SetterMethods()
    public void setMaxMarks(int maxMarks) {this.marksObtained = maxMarks;}
    public void setObtainedMarks(int marksObtained) {this.marksObtained = marksObtained;}

    // Constructor
    public Subject(String name, String id) {
        this.name = name;
        this.id = id;
    }


     public Subject(String name, String id, int maxMarks) {
        this.name = name;
        this.id = id;
        this.maxMarks = maxMarks;
    }

    public Subject(String name, String id, int maxMarks, int marksObtained) {
        this.name = name;
        this.id = id;
        this.maxMarks = maxMarks;
        this.marksObtained = marksObtained;
    }

    @Override
    public String toString()
    {
        return "\nSubject Id : " + this.id + "\nName : " + name + "\nMarks Obtained: " + marksObtained;
    }

}

class Student {
    private String roll;
    private String name;
    private String dept;
    private Subject S[];    // Refference of array object


    public String getRoll(){return this.roll;}
    public String getName(){return this.name;}
    public String getDept(){return this.dept;}


}

public class ArrayOfObject {

    public static void main(String[] args) {
            
        Subject S[] = new Subject[3]; // Reference to the object Subject 

        S[0] = new Subject("DS","S1",100);
        S[1] = new Subject("Algorithms","S2", 100);
        S[2] = new Subject("OS","S3",100);


        for(Subject s: S)
        {
            System.out.println(s); // ByDefault toString() method gets called which is overloaded in the Class itself. 
        }

    }

}
