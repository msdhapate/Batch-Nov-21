package JavaBasics;

import java.util.ArrayList;
import java.util.Hashtable;


public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put("A", "Tom");
		h.put("B", "Mahesh");
		h.put("C", "Hello");
		
		System.out.println(h.size());
		
		h.put(1,  100);
		h.put(2, 200);
		
		System.out.println(h.size());
		System.out.println(h.get(2));
		System.out.println(h.get("B"));
		
		//RESTRICTIONS FOR HASTABLE
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(1,100);
		//h1.put(1, "hii");
		
		Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
		h2.put(1,"Avinash");
		//h2.put(4, 12.99);
		
		
		
		
		
		
		

	}

}
