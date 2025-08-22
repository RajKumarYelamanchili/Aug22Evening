package static_keyword;

public class StaticMethodEx {
	
	 static String collegeName="Ramaiyah College";
	
	static void displayCollegeName()
	{
		System.out.println("Name of the college:" + collegeName);
	}

	public static void main(String[] args) {
		
		StaticMethodEx  obj = new StaticMethodEx();
		     obj.displayCollegeName();//by creating an instance
		System.out.println("**************");
		StaticMethodEx.displayCollegeName();//by classname
		
		
		System.out.println("**************");
		displayCollegeName();
		
		
		
	

	}

}
