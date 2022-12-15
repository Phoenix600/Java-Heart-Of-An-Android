
class Student 
{
	private String rollNo;
	private String name;
	private String depart;
	private Student[] S = new Student[25];
}


class Subject 
{
	private String subjectId;
	private String name;
	private int maxMarks;
	private int marksObtained;


	public Subject(String SID, String sName)
	{
		this.subjectId = SID;
		this.name = sName;
	}

	public Subject(String SID, String sName, int maxMarks)
	{
		this.subjectId = SID;
		this.name = sName;
		this.maxMarks = maxMarks;
	}

	// Getter Method
	public String getSubjectId(){ return subjectId;}
	public String getName(){return name;}
	public int getMaxMarks(){return maxMarks;}
	public int getMarksObtained(){return marksObtained;}

	// Setter methods
	public void setMarksObtained(int Mark){marksObtained = Mark;}
	public void setMaxMarks(int maxMarks){this.maxMarks = maxMarks;}

	public boolean isQualified(){return marksObtained >= maxMarks/10*4;}
	public String toString(){return "\n Student Id : " + subjectId + "\nName :" + name + "\nMaxMarks :" + maxMarks + "\nObtained Marks :" + marksObtained + "\n";}



}

class SampleDataHiding
{
	public static void main(String[] args) {
		
		Subject[] A = new Subject[3];

		// A[0] = new Subject("S101","Java");
		// A[1] = new Subject("S102","Data Structures");
		// A[2] = new Subject("S103","Algorthms",100);

		
		// for(Subject S : A)
		// {
			// System.out.println(S.toString());
		// }





	}
}