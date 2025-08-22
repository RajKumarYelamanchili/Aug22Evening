package strings;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		String OriginalString ="no pain no gain";
	String[] words=	  OriginalString.split("\\s");
	for(String a: words)
	{
		System.out.println(a);
	}
    String revString="";
    
    for(int i=0;i<words.length;i++)
    {
    	  String word  = words[i];
    	  
    	  String revWord="";
    	  
    	  for(int j=word.length()-1;j>=0;j--)
    	  {
    		  revWord =revWord + word.charAt(j);
    	  }
    	  
    	  revString = revString + revWord + " ";  
    	  
    }
    
  System.out.println("Reverse of the string : " + revString);  
    
    
	}//end of main

}//end of class
