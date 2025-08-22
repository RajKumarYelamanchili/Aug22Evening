package selection_statements;

import java.util.Scanner;

public class LargestOfThreeUsingNestedIf
{
	public static void main(String[] args) 
	{
		int largest;
		Scanner sc = new Scanner(System.in)	;
		System.out.println("Please enter the value of n1: ");
		       int n1=  sc.nextInt();
		System.out.println("Please enter the value of n2: ");
		       int n2=  sc.nextInt();
   		System.out.println("Please enter the value of n3: ");
		       int n3=  sc.nextInt();
		
	
       if (n1 >= n2)
       {
    	   if (n1>= n3)
    	   {
    		   largest      =  n1;
    	   }
    	   else
    	   {
    		   largest      =  n3;
    	   }
       }
       else
       {
    	    if (n2>=n3)
    	    {
    	    	largest    = n2;
    	    }
    	    else
    	    {
    	    	largest     =   n3;
    	    }
     	   
       }

System.out.println("largest of n1,n2,n3 is " + largest);
	}//end of main method

}//end of class
