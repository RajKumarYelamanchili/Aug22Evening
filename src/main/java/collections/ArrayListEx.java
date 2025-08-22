package collections;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
	   ArrayList<String>   lst   =  new  ArrayList<String>();
	     lst.add("Dhoni");
	     lst.add("Rishabh");
	     lst.add(null);
	     lst.add("Alia");
	     lst.add("Rishabh");
	     lst.add(null);
	     lst.add(null);
	     lst.add("Kiara");
	     lst.add("Dhoni");
	     lst.add("Rahul");
	     
	     
           lst.remove(1);
			/*
			 * for(String name: lst) { System.out.println(name); }
			 */
           
            int arrayListSize=  lst.size();
            for(int i=0;i<arrayListSize;i++)
            {
            	System.out.println(lst.get(i));
            }
           
	}

}
