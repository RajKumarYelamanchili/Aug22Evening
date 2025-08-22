package strings;
public class StringMethods {
	public static void main(String[] args) {
		/*
		 * String s1="Sachin"; String s2="Sachin"; String s3= new String("Sachin");
		 * String s4="sachin";
		 * 
		 * System.out.println(s1==s2);//true System.out.println(s1==s3);//false
		 * System.out.println(s1.equals(s2));//true
		 * System.out.println(s2.equals(s3));//true
		 * System.out.println(s1.equals(s4));//false
		 * System.out.println(s1.equalsIgnoreCase(s4));//true
		 * 
		 * System.out.println(s1.compareTo(s4));//-32
		 * System.out.println(s1.compareToIgnoreCase(s4));//0
		 */
		/*
		 * String str1="Software"; //System.out.println(str1.contains("t"));
		 * 
		 * //System.out.println(str1.startsWith("So"));
		 * System.out.println(str1.endsWith("ware"));
		 */
		
		String str2="Virat";
		/*
		 * System.out.println(str2.length());//5
		 * 
		 * System.out.println(str2.charAt(3));//a
		 */		
	//	System.out.println(str2.indexOf('i'));//1
		
		
	/*
	 * System.out.println(str2.toLowerCase());//virat
	 * System.out.println(str2.toUpperCase());//VIRAT
	 * 
	 * String str3="assassination"; int i = str3.lastIndexOf('s');
	 * System.out.println("last time s is occuring is in the position : " + i);
	 * 
	 * String str4="best"; String str5 = str4.replaceAll("[a-z]", "java");
	 * System.out.println(str5);
	 */
	/*
	 * String str6="Abdul Kalam";
	 * 
	 * char[] ch= str6.toCharArray(); for(char s : ch) { System.out.println(s); }
	 */
		  
	/*
	 * String r1="Java"; String r2="";
	 * 
	 * System.out.println(r1.isEmpty());//false
	 * System.out.println(r2.isEmpty());//true
	 */	
	
	  String str7="what you practice in life you will become"; String[] result=
	  str7.split(" ");
	  
	  for(String b : result) { System.out.println(b); }
	 
		    
	String y="welcome"	;
	System.out.println(y.substring(2));
	
	System.out.println(y.substring(2, 4));
	
	System.out.println(y.subSequence(2, 4));
		

	}

}
