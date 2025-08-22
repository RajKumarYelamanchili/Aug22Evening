package object_oriented;

class Student1
{
	int id;
	String name;
}

public class TestStudent {

	public static void main(String[] args) {
	
			Student1 stu1 = new Student1();
			        stu1.id =101;
			        stu1.name="Ravi";
			 System.out.println(stu1.id + "      " + stu1.name);
			 
			 Student1 stu2 = new Student1();
			         stu2.id=207;
			         stu2.name="Arati";
			System.out.println(stu2.id + "               " + stu2.name);
			 
			 
	}

}
