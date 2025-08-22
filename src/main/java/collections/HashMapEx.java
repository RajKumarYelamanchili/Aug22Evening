package collections;

import java.util.HashMap;
import java.util.HashSet;
public class HashMapEx {
	public static void main(String[] args) {
	
		HashMap<Integer,String>  hm  = new HashMap<Integer,String>();
		                        hm.put(3, "Raj");
		                        hm.put(2, "Anil");
		                        hm.put(1, "Sushma");
		                        hm.put(3, "Raj");
		                        hm.put(5, "Kumar");
		                        hm.put(6, "Raj");
		                        
		                        System.out.println(hm);
		
		

	}

}
