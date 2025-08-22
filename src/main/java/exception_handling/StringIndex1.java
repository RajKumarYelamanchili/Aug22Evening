package exception_handling;

public class StringIndex1 {

	public static void main(String[] args) {
		
		try
		{
		String a ="Sachin Tendulkar";
		System.out.println(a.length());
		
		   char c     =  a.charAt(25);
		   System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("pls ensure the index is less than 16");
		}

	}

}
