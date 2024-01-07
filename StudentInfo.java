class StudentInfo
{
	int rollNumber;
	String name;
	int m;
}
public void addName(String name,int rollNo)
{
	addName=name;
	rollNumber=rollNo;
}
public void showMarks()
{
	System.out.println("marks:"+marks);
}
class Student
{
	public static void main(String[] args)
	{
		Student name=new Student();
		name.addName("Rama",1234);
		name.showMarks();
	}
}
	



	