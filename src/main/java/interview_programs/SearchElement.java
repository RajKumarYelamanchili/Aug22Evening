package interview_programs;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("how many elements in array ?");
		         int  n  =  sc.nextInt();//5
		         int flag=0;
		         int[] a = new int[n];
		     System.out.println("pls enter those elements:");
		     for(int i=0;i<n;i++)
		     {
		    	       a[i]     =sc.nextInt();
		     }
		     
		System.out.println("Pls enter which element you want to search: ?");  
		               int  search    =    sc.nextInt();//56
		        
		  
		               for(int i=0;i<n;i++)
		               {
		            	   if (a[i]==search)
		            	   {
		            		  System.out.println("Element " + search + " is found at " + (i+1) + " position.");
		            		  flag=1;
		            		  break;
		            		  
		            	   }
		               }
		     
		               if (flag==0)
		               {
		            	   System.out.println("element " + search + " not found.");
		               }
		    
		

	}

}
