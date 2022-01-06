package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add("tom");
		ar.add("hello");
		ar.add('m');
		ar.add(500);
		
		
		System.out.println(ar.size());
		
		ar.remove(6);
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		
		//to print all the values of array list use for loop
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
		//if we want to restrict array list--then
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(500);
		//ar1.add("mahesh");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("kartik");
		//ar2.add(100);
		
		
		
		
		
		

	}

}
