package zeh;

public class StringIndex1 {

	public static void main(String[] args) {
		
		try
		{
		String a ="Sachin Tendulkar";
		System.out.println("length of the string: " + a.length());
		
		  char ch =  a.charAt(23);
		  System.out.println(ch);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("pls ensure the index is less than 16");
		}
		

	}

}
