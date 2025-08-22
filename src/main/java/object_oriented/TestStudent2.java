package object_oriented;
class Student2
{
	int rollno;
	String name;
	
	void insertRecord(int r,String n)
	{
		    rollno   = r;
		     name   =  n;
	}
	void displayInfo()
	{
		System.out.println(rollno + "   " + name);
	}
}

public class TestStudent2 {
	public static void main(String[] args) {
		Student2 stu1 = new Student2();
			 stu1.insertRecord(302, "SRK");
			 stu1.displayInfo();
	
	    Student2 stu2 = new Student2();
	          stu2.insertRecord(405, "Akshay Kumar");
	          stu2.displayInfo();
		

	}

}
