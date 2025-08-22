package strings;

public class NonSpaceCharacter {

	public static void main(String[] args) {
	  String str="create the world you want within you";
  System.out.println("length of the string: " + str.length());//36
  int count=0;
  for(int i=0;i<str.length();i++)
  {
	  if (str.charAt(i) != ' ')
		  count++;
  }
  
  System.out.println("Number of non space characters is : " +count);

	}

}
