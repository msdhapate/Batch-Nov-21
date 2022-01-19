package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(20, 30);
		
		// you can not create a method inside a method
		// duplicates method-->same method name with same data types or same no of arguments are not allowed
		
		//method overloading-->when the method name is same with diff arguments or input parameters within the same class.

	}
	
	public static void main(int q) {  //we can overload main method also
		
	}

	public void sum() {  // 0 input parameter
		System.out.println("Sum method--zero param");	
	}
	
	public void sum(int i) {  // 1 input parameter
		System.out.println("sum method");
		System.out.println(i);
	}

	public void sum(int k,int l) {  // 2 input parameter
		System.out.println("sum method");
		System.out.println(k+l);
	}
	
	
}
