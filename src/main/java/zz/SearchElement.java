package zz;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("enter number of elements?");
	int n = sc.nextInt();
	int search;
	int flag=0;
int a[] = new int[n];
	System.out.println("enter the elements: ");
	for(int i=0;i<n;i++)
	{
	 a[i]= sc.nextInt();
	// System.out.println(a[i]);
	}
	
	System.out.println("enter element to be searched:");
	search = sc.nextInt();
	
	for(int i=0;i<n;i++)
	{
		if (a[i] == search)
		{
			System.out.println("element " + search + " is found at " + (i+1) + " position.");
			flag=1;
			break;
			
		}
		
	}
	if (flag==0)
	{
		System.out.println("element " + search + "is not found.");
	}
		
		
	}

}
