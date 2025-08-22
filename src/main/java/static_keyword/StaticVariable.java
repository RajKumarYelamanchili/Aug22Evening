package static_keyword;

public class StaticVariable {
	
	static String  collegeName="AVN College";
	
	void displayStudentInfo(String name,String branch)
	{
		System.out.println("Name of the student: " + name);
		System.out.println("Branch of the student: " + branch);
		System.out.println("College Name is : " + collegeName);
		
	}
	
	
	
	public static void main(String[] args) {
		StaticVariable obj = new StaticVariable();
		   obj.displayStudentInfo("Raj", "Mech");
		   System.out.println("************");
		   obj.displayStudentInfo("Sunil", "Civil");
		   
		   System.out.println("************");
		   obj.displayStudentInfo("Katrina", "CS");
		   
		   System.out.println("************");
		          

	}

}
